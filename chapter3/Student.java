public class Student{
	private String name;
	private int roll;
	private float marks[] = new float[5];
	public Student(String n, int r, float m[]){
		name = n;
		roll = r;
		marks = m;
	}
	public String PrintDetails(){
		return "Name: "+name+" Roll: "+roll;
	}
	public float PrintPercentage(){
		float sum = 0, percentage = 0;
		for(int i=0; i<marks.length; i++){
			sum+=marks[i];
		}
		percentage = sum/500*100;
		return percentage;
	}
}
