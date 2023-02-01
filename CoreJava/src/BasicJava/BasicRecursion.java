package BasicJava;

public class BasicRecursion {

	public static void main(String[] args) {
		
		int number = 5;
		int sum = addNumbers(number);
		System.out.println("Sum = "+sum);
		

	}
	
	public static int addNumbers(int num)
	{
		if(num != 0) // 5!=0 -> 4!=0.... 0!=0
		{
			return num + addNumbers(num-1); // 5 + addNumbers(4)
		}
		else
		{
			return num;
		}
	}
	
	// Recursion --> calling the same function inside the function
	// 5 + addNumbers(4) - result - pending
	// 4 + addNumbers(3) - result - pending
	// 3 + addNumbers(2) - result - pending
	// 2 + addNumbers(1) - result - pending
	// 1 + addNumbers(0) - result - pending
	
	
	
	
	
	
	
	

}
