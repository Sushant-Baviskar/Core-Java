package BasicJava;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		year=sc.nextInt();
		boolean b;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					b=true;
				}
				else
				{
					b=false;
				}
			}
			else
			{
				b=true;
			}
		}
		else
		{
			b=false;
		}
		
		if (b)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
			
		

	}

}
