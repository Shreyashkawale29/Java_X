package Array;

public class Linear_Search {

	public static void main(String[] args) {
		
		int arr[] = { 8, 14, 36, 62, 94, 35};
		
		int search = 62;
		int index = -1;
		
		
		for(int i=0; i < arr.length; i++){
			
			if(arr[i] == search) {
				index = i;
				break;
			}
			
		}
		
		System.out.println("Element Present on Index: "+index);
			
	}

}


