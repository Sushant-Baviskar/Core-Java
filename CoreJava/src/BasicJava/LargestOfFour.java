package BasicJava;

import java.util.Scanner;

public class LargestOfFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter four nos.: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(a>b&&a>c&&a>d)
		{
			System.out.println(a+" is largest");
		}
		else if(b>c&&b>d)
		{
			System.out.println(b+" is largest");
		}
		else if(c>d)
		{
			System.out.println(c+" is largest");
		}
		else
		{
			System.out.println(d+" is largest");
		}
	}

}
