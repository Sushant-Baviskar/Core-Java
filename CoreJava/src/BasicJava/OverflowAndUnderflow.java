package BasicJava;

public class OverflowAndUnderflow {

	public static void main(String[] args) {
		int overflow = 2147483647;
		System.out.println("Overflow :"+ (overflow + 1));
		
		int underflow = -2147483648;
		System.out.println("Underflow :"+ (underflow - 1));
	}

}
