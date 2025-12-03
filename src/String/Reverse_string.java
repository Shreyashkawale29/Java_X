package String;

public class Reverse_string {

	public static void main(String[] args) {
		
		String text = "I am Java Developer!";
		
		for(int i = text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
			
		}

	}

}
