public class Rectangle{
	private float length, breadth;
	public Rectangle(float l, float b){
		length = l;
		breadth = b;
	}
	public float findArea(){
		return length*breadth;
	}
	public float findPerimeter(){
		return 2*(length+breadth);
	}
}
