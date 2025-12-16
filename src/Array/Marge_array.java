package Array;

public class Marge_array {

	public static void main(String[] args) {
		
		int arr1[] = {4, 7, 3, 9, 2};
		int arr2[] = {1, 3, 5, 7, 9};
		
		int merge[] = new int[arr1.length + arr2.length];
		
		int index = 0;
		
		for(int i =0; i < arr1.length; i++) {
			
			merge[index] = arr1[i];
			index++;
			
		}
		
		for(int i=0; i < arr2.length; i++) {
			
			merge[index] = arr2[i];
			index++;
		}
		
		for (int i : merge) {
			System.out.print(" "+i);
		}

	}

}
