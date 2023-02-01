package BasicJava;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter nth no.");
        n=sc.nextInt();
        
        int num1=0,num2=1;
       
        int counter = 0;
        while(counter<n)
        {
        	System.out.print(" "+num1+" ");
        	int num3 = num1+num2;
        	num1=num2;
        	num2=num3;
        	
            counter++;
        }
	}

}
