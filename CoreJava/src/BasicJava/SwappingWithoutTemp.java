package BasicJava;
import java.util.*;
public class SwappingWithoutTemp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,x,y;
		System.out.println("Enter nos. :");
		a=sc.nextInt();
		b=sc.nextInt();

		
		System.out.println("Values before swapping are :"+a+" and "+b);
		
		if(a<b)
		{
			x=a;
			a=a+(b-a);
			b=x;
			System.out.println("Values after swapping are :"+a+" and "+b);
		}
		else if(a>b)
		{
			y=b;
			b=b+(a-b);
			a=y;
			System.out.println("Values after swapping are :"+a+" and "+b);
		}
		else
		{
			System.out.println("Values after swapping are :"+a+" and "+b);
		}

	}

}
