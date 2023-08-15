public class Circle{
	public static void main(String[]a){
		float r = Float.parseFloat(a[0]);
		double area = Math.PI*r*r;
		double circumference = 2*Math.PI*r;
		System.out.println("The area is "+area);
		System.out.println("The circumference is "+circumference);
	}
}
