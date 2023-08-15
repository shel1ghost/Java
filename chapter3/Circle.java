public class Circle{
	private float radius;
	public Circle(float r){
		radius = r;
	}
	public double Area(){
		return Math.PI*radius*radius;
	}
	public double Circumference(){
		return 2*Math.PI*radius;
	}
}
