package BasicJava;
import java.util.*;
public class SwappingUsingTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b  , temp;
		System.out.println("Enter nos. :");
		a=sc.nextInt();
		b=sc.nextInt();

		
		System.out.println("Values before swapping are :"+a+" and "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values after swapping are :"+a+" and "+b);
		
		}

}
