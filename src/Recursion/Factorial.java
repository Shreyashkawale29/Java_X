package Basic;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(getfactorial(5));
		

	}
	
	public static int getfactorial(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		
		return n * getfactorial(n - 1);
		
	}
	

}
