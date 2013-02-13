package chapter10.layout2d

class LineElement(s:String) extends ArrayElement(Array(s)) {
	override def width = s.length
	override def height = 1
}