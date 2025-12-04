package Array;

public class Copy_element {

	public static void main(String[] args) {
		// Copy array elements into another array
		
		int array[] = { 32, 52, 64 ,25, 34};
		
		int copyarr[] = new int[array.length]; 
		
		for(int i=0; i < array.length; i++) {
			
			copyarr[i] = array[i];
			
		}
		
		System.out.print("Copy Array: ");
		
		for (int i : copyarr) {
			System.out.print(i+" ");
		}

	}

}
