package BasicJava;
import java.util.Scanner;
public class ReversingNumber {
	
	static int reverseNum(int n)
	{
		int x = 0;
		while(n>0)
		{
			int rem = n%10;
			x=x*10+rem;
			n/=10;
			
		}
		
		return x;
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ");
		int n=sc.nextInt();
		
		System.out.println(reverseNum(n));
		
	}

}
