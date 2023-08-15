public class Program23{
	public static void main(String[]args){
		int sum = 0, count = 0;
		for(int i=100; i<=200; ++i){
			if(i%7==0){
				sum+=i;
				count++;
			}
		}
		System.out.println("The number of numbers divisible by 7 between 100-200 are "+count+" and their sum is "+sum);
	}
}
		
