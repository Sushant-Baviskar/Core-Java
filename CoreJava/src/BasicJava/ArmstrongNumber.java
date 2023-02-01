package BasicJava;

import java.util.Scanner;

public class ArmstrongNumber {
static int order(int x)            // checking the no of digits in given number
{
	int count = 0 ;
	while(x>0)
	{
		x=x/10;
		count++;
	}
	return count;
	
}

static int sumOfPowers(int x,int power)
{
	int sum = 0,digit;
	while(x>0)
	{
		digit = x%10;
		sum = (int) (sum + Math.pow(digit, power));
	    x=x/10;
	}
	return sum;
}

static boolean isArmstrong(int sum,int n)
{
	if(sum==n)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
}
	public static void main(String[] args)
	{
		int num;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		int m = order(num);
		int sum = sumOfPowers(num,m);
		boolean g = isArmstrong(sum,num);
		
		if(g)
		{
			System.out.println("It is an armstrong no");
		}
		else {
			System.out.println("It is not an armstrong no");
		}
	}

}
