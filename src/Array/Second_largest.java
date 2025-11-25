package Array;

public class Second_largest {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 66, 99, 45, 8, 1, 100};
		
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]> largest) {
				
				secondlargest = largest;
				largest = arr[i];
				
				
			}
			else if(arr[i]> secondlargest && arr[i]<largest) {
				
				secondlargest = arr[i];
				
			}
			
		}
		System.out.println("SecondLargest Number: "+secondlargest);

	}

}
