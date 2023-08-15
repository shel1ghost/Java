public class MainStudent{
	public static void main(String[]args){
		//float marks[] = new float[5];
		float marks[] = {100f, 100f, 100f, 100f, 100f};
		Student std = new Student("Babi", 1, marks);
		String details = std.PrintDetails();
		float percentage = std.PrintPercentage();
		System.out.println(details);
		System.out.println("The percentage is "+percentage+"%");
	}
}
