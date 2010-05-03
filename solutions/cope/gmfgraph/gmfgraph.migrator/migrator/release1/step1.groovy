gmfgraphPackage = gmfgraph
scalablePolygonClass = gmfgraphPackage.newEClass()
scalablePolygonClass.name = "ScalablePolygon"
polygonClass = gmfgraph.Polygon
scalablePolygonClass.eSuperTypes.add(polygonClass)
eAnnotation = scalablePolygonClass.newEAnnotation()
eAnnotation.source = "http://www.eclipse.org/emf/2002/GenModel"
eStringToStringMapEntry = eAnnotation.newEStringToStringMapEntry()
eStringToStringMapEntry.key = "documentation"
eStringToStringMapEntry.value = "Marker interface to denote polygons with ability to autoscale to fit all available bounds. Separate class is needed instead of property in the Polygon class because of generalization PolygonDecoration extends Polygon"
nodeClass = gmfgraph.Node
affixedParentSideAttribute = nodeClass.newEAttribute()
affixedParentSideAttribute.name = "affixedParentSide"
affixedParentSideAttribute.defaultValueLiteral = "NONE"
directionEnum = gmfgraph.Direction
affixedParentSideAttribute.eType = directionEnum
defaultSizeFacetClass = gmfgraphPackage.newEClass()
defaultSizeFacetClass.name = "DefaultSizeFacet"
visualFacetClass = gmfgraph.VisualFacet
defaultSizeFacetClass.eSuperTypes.add(visualFacetClass)
defaultSizeReference = defaultSizeFacetClass.newEReference()
defaultSizeReference.name = "defaultSize"
defaultSizeReference.containment = true
dimensionClass = gmfgraph.Dimension
defaultSizeReference.eType = dimensionClass
borderClass = gmfgraph.Border
eObjectClass = emf.EObject
borderClass.eSuperTypes.add(eObjectClass)
colorClass = gmfgraph.Color
colorClass.eSuperTypes.add(eObjectClass)
customAttributeClass = gmfgraph.CustomAttribute
customAttributeClass.eSuperTypes.add(eObjectClass)
dimensionClass.eSuperTypes.add(eObjectClass)
fontClass = gmfgraph.Font
fontClass.eSuperTypes.add(eObjectClass)
insetsClass = gmfgraph.Insets
insetsClass.eSuperTypes.add(eObjectClass)
layoutClass = gmfgraph.Layout
layoutClass.eSuperTypes.add(eObjectClass)
layoutDataClass = gmfgraph.LayoutData
layoutDataClass.eSuperTypes.add(eObjectClass)
pointClass = gmfgraph.Point
pointClass.eSuperTypes.add(eObjectClass)
figureClass = gmfgraph.Figure
figureClass.eSuperTypes.add(eObjectClass)
borderClass.eSuperTypes.remove(eObjectClass)
colorClass.eSuperTypes.remove(eObjectClass)
customAttributeClass.eSuperTypes.remove(eObjectClass)
dimensionClass.eSuperTypes.remove(eObjectClass)
fontClass.eSuperTypes.remove(eObjectClass)
insetsClass.eSuperTypes.remove(eObjectClass)
layoutClass.eSuperTypes.remove(eObjectClass)
layoutDataClass.eSuperTypes.remove(eObjectClass)
pointClass.eSuperTypes.remove(eObjectClass)
figureClass.eSuperTypes.remove(eObjectClass)
borderClass.'abstract' = true
identityClass = gmfgraph.Identity
identityClass.'abstract' = true
visualFacetClass.'abstract' = true
figureClass.'abstract' = true
layoutableClass = gmfgraph.Layoutable
layoutableClass.'abstract' = true
connectionFigureClass = gmfgraph.ConnectionFigure
connectionFigureClass.'abstract' = true
fontClass.'abstract' = true
figureHandleClass = gmfgraph.FigureHandle
figureHandleClass.'abstract' = true
layoutDataClass.'abstract' = true
decorationFigureClass = gmfgraph.DecorationFigure
decorationFigureClass.'abstract' = true
figureMarkerClass = gmfgraph.FigureMarker
figureMarkerClass.'abstract' = true
layoutClass.'abstract' = true
colorClass.'abstract' = true
customClassClass = gmfgraph.CustomClass
customClassClass.'abstract' = true
