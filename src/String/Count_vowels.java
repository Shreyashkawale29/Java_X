package String;

public class Count_vowels {

	public static void main(String[] args) {
		
		String text = "Java is Awesome.";
		
		int count = 0;
		
		for(int i=0; i < text.length()-1;i++) {
			
			char ch = Character.toLowerCase(text.charAt(i));
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u') {
				
				count++;
				
				
			}
			
		}
		System.out.println("Count of Vowels present in a string is "+ count);

	}

}
