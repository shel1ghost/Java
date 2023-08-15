public class Array31{
	public static void main(String[]args){
		float nums[] = {10.2f, 5.5f, 6.0f, 7f, 8f, 10f, 2.4f, 3.2f, 2f, 1f};
		float sum = 0, avg;
		double prod = 1;
		for(int i=0; i<nums.length; i++){
			sum+=nums[i];
			prod*=nums[i];
		}
		avg = sum/nums.length;
		System.out.println("Sum = "+sum);
		System.out.println("Product = "+prod);
		System.out.println("Average = "+avg);
	}
}
