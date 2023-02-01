package BasicJava;

public class CheckArmstrongNumber {
	
	public static boolean checkArmstrong(int num)
	{
		int digits = 0;
		int result = 0;
		int originalNum = num;
		
		// Checking number of digits in a given number
		
		while(originalNum!=0)
		{
			originalNum/=10;
			digits++;
		}
		
		originalNum = num;
		
		// result contains sum of nth powers of its digits
        
		while(originalNum!=0)
		{
			int remainder = originalNum % 10;
			result = (int)(result+ Math.pow(remainder,digits));
			originalNum/=10;
		}
		
		if(result == num)
		{
			System.out.println(num+" is an armstrong number");
			return true;
		}
		else
		{
			System.out.println(num+" is not an armstrong number");
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		
		checkArmstrong(153);
		
		int low = 999,high = 99999;
		
		for(int number = low+1;number<high;++number)
		{
			if(checkArmstrong(number))
			{
				System.out.println(number+" ");
			}
		}
		
		
	}
}
