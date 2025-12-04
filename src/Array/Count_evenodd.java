package Array;

public class Count_evenodd {

	public static void main(String[] args) {

		int arr[] = {5, 8, 11, 14, 17, 3, 50};
		
		int counteven=0;
		int countodd=0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 ==0 ) {
				counteven++;
			}else {
				countodd++;
			}
		}
		
		System.out.println("Even count: "+counteven);
		System.out.println("Odd count: "+countodd);

	}

}
