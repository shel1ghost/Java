public class MainRectangle{
	public static void main(String[]args){
		Rectangle rect = new Rectangle(10, 20);
		float area = rect.findArea();
		float perim = rect.findPerimeter();
		System.out.println("The area is "+area+" and the perimeter is "+perim);
	}
}
