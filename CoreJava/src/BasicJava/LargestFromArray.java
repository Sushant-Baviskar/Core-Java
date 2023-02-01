package BasicJava;

public class LargestFromArray {

	public static void main(String[] args) {
		double[]  numArray = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};
		double largest = numArray[0];
		
		for(double num: numArray)
		{
			if(largest<num)
			{
				largest = num;
			}
		}
		System.out.format("Largest Element : %.2f", largest);
	}

}
