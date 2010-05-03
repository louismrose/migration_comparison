ownerReference = gmfgraph.ChildAccess.owner
eAnnotation = ownerReference.newEAnnotation()
eAnnotation.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry = eAnnotation.newEStringToStringMapEntry()
eStringToStringMapEntry.key = "suppressedSetVisibility"
eStringToStringMapEntry.value = "true"
ownerReference.changeable = true
ownerReference.resolveProxies = false
ownerReference.changeable = false
eAnnotation.delete()
gmfgraphPackage = gmfgraph
borderRefClass = gmfgraphPackage.newEClass()
borderRefClass.name = "BorderRef"
borderClass = gmfgraph.Border
borderRefClass.eSuperTypes.add(borderClass)
eAnnotation2 = borderRefClass.newEAnnotation()
eAnnotation2.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry2 = eAnnotation2.newEStringToStringMapEntry()
eStringToStringMapEntry2.key = "documentation"
eStringToStringMapEntry2.value = "Border reuse mechanism"
actualReference = borderRefClass.newEReference()
actualReference.name = "actual"
actualReference.lowerBound = 1
actualReference.eType = borderClass
eAnnotation3 = actualReference.newEAnnotation()
eAnnotation3.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry3 = eAnnotation3.newEStringToStringMapEntry()
eStringToStringMapEntry3.key = "documentation"
eStringToStringMapEntry3.value = "constraint: actual should not be another BorderRef"
layoutRefClass = gmfgraphPackage.newEClass()
layoutRefClass.name = "LayoutRef"
layoutClass = gmfgraph.Layout
layoutRefClass.eSuperTypes.add(layoutClass)
eAnnotation4 = layoutRefClass.newEAnnotation()
eAnnotation4.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry4 = eAnnotation4.newEStringToStringMapEntry()
eStringToStringMapEntry4.key = "documentation"
eStringToStringMapEntry4.value = "Layout reuse mechanism"
actualReference2 = layoutRefClass.newEReference()
actualReference2.name = "actual"
actualReference2.lowerBound = 1
actualReference2.eType = layoutClass
eAnnotation5 = actualReference2.newEAnnotation()
eAnnotation5.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry5 = eAnnotation5.newEStringToStringMapEntry()
eStringToStringMapEntry5.key = "documentation"
eStringToStringMapEntry5.value = "constraint: actual should not be another LayoutRef"
figureGalleryClass = gmfgraph.FigureGallery
bordersReference = figureGalleryClass.newEReference()
bordersReference.name = "borders"
bordersReference.upperBound = -1
bordersReference.containment = true
bordersReference.eType = borderClass
eAnnotation6 = bordersReference.newEAnnotation()
eAnnotation6.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry6 = eAnnotation6.newEStringToStringMapEntry()
eStringToStringMapEntry6.key = "documentation"
eStringToStringMapEntry6.value = "Borders for reuse"
layoutsReference = figureGalleryClass.newEReference()
layoutsReference.name = "layouts"
layoutsReference.upperBound = -1
layoutsReference.containment = true
layoutsReference.eType = layoutClass
eAnnotation7 = layoutsReference.newEAnnotation()
eAnnotation7.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry7 = eAnnotation7.newEStringToStringMapEntry()
eStringToStringMapEntry7.key = "documentation"
eStringToStringMapEntry7.value = "Layouts for reuse"
