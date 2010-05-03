typedFigureReference = gmfgraph.FigureAccessor.typedFigure
typedFigureReference.lowerBound = 1

for(fa in gmfgraph.FigureAccessor.allInstances) {
	def tf = fa.typedFigure
	if(tf == null) {
		tf = gmfgraph.CustomFigure.newInstance()
		tf.qualifiedClassName = "org.eclipse.draw2d.IFigure"
		fa.typedFigure = tf
	}
}