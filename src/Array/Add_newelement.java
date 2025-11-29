package Array;

public class Add_newelement {

	public static void main(String[] args) {


		int oldarr[] = {1, 2, 3, 4};
		
		int new_value = 10;
		
		int newarr[] = new int[oldarr.length +1];
		
		for(int i = 0; i < oldarr.length; i++) {
			
			newarr[i] = oldarr[i];
			
		}
		
		newarr[newarr.length - 1] = new_value;
		
		
		
		for (int x : newarr) {
			System.out.print(x+" ");
		}

	}

}
