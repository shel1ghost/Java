public class Box{
	private float height;
	public Box(float h){
		height = h;
	}
	public float Volume(){
		return height*height*height;
	}
	public float SurfaceArea(){
		return 6*(height*height);
	}
}
