package BasicJava;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String sentence = "Go work";
		String reversed = reverse(sentence);
		System.out.println("The reversed sentence is: "+reversed);
		}
	
	public static String reverse(String sentence)
	{
		if(sentence.isEmpty())
		   return sentence;
		else
		   return reverse(sentence.substring(1)) + sentence.charAt(0);
		
	}

}
