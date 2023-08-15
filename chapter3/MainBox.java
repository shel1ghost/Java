public class MainBox{
	public static void main(String[]args){
		Box bx = new Box(10f);
		float vol = bx.Volume();
		float tsa = bx.SurfaceArea();
		System.out.println("The volume is "+vol+" and the TSA is "+tsa);
	}
}
