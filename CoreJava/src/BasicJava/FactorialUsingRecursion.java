package BasicJava;

public class FactorialUsingRecursion {
	
	public static long multiplyNumbers(int num)
	{
		if(num>=1) // 6>=1
		   return num * multiplyNumbers(num-1); // 6 + multiplyNumbers(5)
		
		else
		   return 1;
	}
	

	public static void main(String[] args) {
		
		int num = 6;
		long factorial = multiplyNumbers(num);
		System.out.println("Factorial of"+num+" = "+factorial);

	}
	
	//6 * multiplyNumbers(5) - result pending
	//5 * multiplyNumbers(4) - result pending
	//4 * multiplyNumbers(3) - result pending
	//3 * multiplyNumbers(2) - result pending
	//2 * multiplyNumbers(1) - result pending
	//1 * multiplyNumbers(0) - result pending

	

}
