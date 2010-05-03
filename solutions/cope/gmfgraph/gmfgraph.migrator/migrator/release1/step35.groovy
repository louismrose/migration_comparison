gmfgraphPackage = gmfgraph
childAccessClass = gmfgraphPackage.newEClass()
childAccessClass.name = "ChildAccess"
accessorAttribute = childAccessClass.newEAttribute()
accessorAttribute.name = "accessor"
eStringDataType = emf.EString
accessorAttribute.eType = eStringDataType
figureReference = childAccessClass.newEReference()
figureReference.name = "figure"
figureReference.lowerBound = 1
figureClass = gmfgraph.Figure
figureReference.eType = figureClass
eAnnotation = figureReference.newEAnnotation()
eAnnotation.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry = eAnnotation.newEStringToStringMapEntry()
eStringToStringMapEntry.key = "documentation"
eStringToStringMapEntry.value = "This may also point to RealFigure from FigureAccessor#typedFigure"
figureDescriptorClass = gmfgraphPackage.newEClass()
figureDescriptorClass.name = "FigureDescriptor"
identityClass = gmfgraph.Identity
figureDescriptorClass.eSuperTypes.add(identityClass)
eAnnotation2 = figureDescriptorClass.newEAnnotation()
eAnnotation2.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry2 = eAnnotation2.newEStringToStringMapEntry()
eStringToStringMapEntry2.key = "documentation"
eStringToStringMapEntry2.value = "The thing describes structure of a figure"
actualFigureReference = figureDescriptorClass.newEReference()
actualFigureReference.name = "actualFigure"
actualFigureReference.lowerBound = 1
actualFigureReference.containment = true
actualFigureReference.eType = figureClass
accessorsReference = figureDescriptorClass.newEReference()
accessorsReference.name = "accessors"
accessorsReference.upperBound = -1
accessorsReference.containment = true
accessorsReference.eType = childAccessClass
ownerReference = childAccessClass.newEReference()
ownerReference.name = "owner"
ownerReference.lowerBound = 1
ownerReference.changeable = false
ownerReference.eType = figureDescriptorClass
ownerReference.eOpposite = accessorsReference
accessorsReference.eOpposite = ownerReference
compartmentClass = gmfgraph.Compartment
accessorReference = compartmentClass.newEReference()
accessorReference.name = "accessor"
accessorReference.eType = childAccessClass
diagramLabelClass = gmfgraph.DiagramLabel
accessorReference2 = diagramLabelClass.newEReference()
accessorReference2.name = "accessor"
accessorReference2.eType = childAccessClass
nodeClass = gmfgraph.Node
contentPaneReference = nodeClass.newEReference()
contentPaneReference.name = "contentPane"
contentPaneReference.eType = childAccessClass
figureGalleryClass = gmfgraph.FigureGallery
descriptorsReference = figureGalleryClass.newEReference()
descriptorsReference.name = "descriptors"
descriptorsReference.upperBound = -1
descriptorsReference.containment = true
descriptorsReference.eType = figureDescriptorClass
descriptorReference = figureClass.newEReference()
descriptorReference.name = "descriptor"
descriptorReference.changeable = false
descriptorReference.'volatile' = true
descriptorReference.'transient' = true
descriptorReference.derived = true
descriptorReference.resolveProxies = false
descriptorReference.eType = figureDescriptorClass
containerReference = diagramLabelClass.newEReference()
containerReference.name = "container"
containerReference.eType = childAccessClass
figureReference2 = gmfgraph.DiagramElement.figure
figureReference2.eType = figureDescriptorClass
figureReference2.eOpposite = null

getTopLevel = { handle ->
	def topLevel = handle
	while(topLevel != null && topLevel.container.instanceOf(gmfgraph.FigureHandle)) {
		topLevel = topLevel.container;
	}
	return topLevel
}

getOrCreateDescriptor = { topLevel ->
	if(topLevel.container.instanceOf(gmfgraph.FigureDescriptor)) {
		return topLevel.container
	}
	def gallery = topLevel.container
	def descriptor = gmfgraph.FigureDescriptor.newInstance()
	descriptor.name = topLevel.name
	gallery.descriptors.add(descriptor)
	gallery.figures.remove(topLevel)
	descriptor.actualFigure = topLevel
	return descriptor;
}

getAccess = { descriptor, figure ->
	for(access in descriptor.accessors) {
		if(access.figure == figure) {
			return access
		}
	}
	return null
}

getOrCreateAccess = { descriptor, figure ->
	def access = getAccess(descriptor, figure)
	if(access == null) {
		access = gmfgraph.ChildAccess.newInstance()
		access.figure = figure
		descriptor.accessors.add(access)
	}
	return access;
}

for(handle in gmfgraph.FigureHandle.allInstances) {
	
	def elements = handle.referencingElements
	
	if(!elements.isEmpty()) {
		def topLevel = getTopLevel(handle)
		def descriptor = getOrCreateDescriptor(topLevel)
		for(element in elements) {
			element.figure = descriptor
		}
		if(handle != topLevel) {
			if(handle.instanceOf(gmfgraph.FigureAccessor)) {
				handle = handle.typedFigure
			}
			def access = getOrCreateAccess(descriptor, handle)
			for(element in elements) {
				if(element.instanceOf(gmfgraph.DiagramLabel) ||
						element.instanceOf(gmfgraph.Compartment)) {
					element.accessor = access
				}
			}
		}
	}
}

deleteFeature(gmfgraph.FigureHandle.referencingElements)