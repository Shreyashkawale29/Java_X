package Array;

public class Count_frequency {

	public static void main(String[] args) {
		
		int arr[] = {8, 2, 3, 6, 8, 5, 2, 8};
		
		int target = 8;
		int count = 0;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				count++;
				
			}
			
		}
		
		System.out.println(target+" number frequency is "+count);

	}

}
