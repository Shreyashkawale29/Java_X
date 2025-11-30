package String;

public class Remove_vowels {

	public static void main(String[] args) {
		
		
		String text = "ThIs is the java program of remove Vowels";
		
		String result = text.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(result);

	}

}
