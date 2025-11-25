package Array;

public class Middel_element {

	public static void main(String[] args) {
		
		int arr[] = {5, 15, 25, 35, 45, 55, 10, 50, 89};
		
		int n = arr.length;
		
		if(n%2==0) {
			
			int mid1 = arr[n/2-1];
			int mid2 = arr[n/2];
			System.out.println("Middle number: "+mid1 +" and " +mid2);
			
		}else {
			int mid = arr[n/2];
			System.out.println("Middle number: "+mid);
		}
		
		
		
	}

}
