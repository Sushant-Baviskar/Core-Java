package BasicJava;

import java.util.Scanner;

public class PassByValue {
	
	public int getValues(int n)
	{
		n=n+10;
		return n;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
        PassByValue ob = new PassByValue();
        int x =  ob.getValues(n);
        System.out.println(x);
	}

}
