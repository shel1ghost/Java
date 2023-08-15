public class MainCircle{
	public static void main(String[]args){
		Circle c1 = new Circle(4f);
		double area = c1.Area();
		double circumference = c1.Circumference();
		System.out.println("The are is "+area+" and the circumference is "+circumference);
	}
}
