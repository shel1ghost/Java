public class Loop284{
	public static void main(String[]args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				int val = i%2;
				System.out.print(val);
			}
			System.out.print("\n");
		}
	}
}
