public class Harmonic{
	public static void main(String[]args){
		int n = Integer.parseInt(args[0]);
		double result = 0.0;
		for(int i=1; i<=n; i++){
			result+=1.0/i;
		}
		System.out.println("The sum of harmonic series is "+result);
	}
}
