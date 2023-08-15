import java.util.Scanner;

public class Array33{
	public static void main(String[]args){
		float nums[] = new float[10];
		float min, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for(int i=0; i < nums.length; i++){
			nums[i] = sc.nextFloat();
		}
		min = nums[0];
		max = nums[0];
		for(int i=0; i < nums.length; i++){
			if(nums[i] < min){
				min = nums[i];
			}
			if(nums[i] > max){
				max = nums[i];
			}
		}
		System.out.println("Minimum = "+min+", Maximum = "+max);
	}
}
