package BasicJava;

public class ThreeDimArray {

	public static void main(String[] args)
	{
		int [][][] test = {
			{
				{1,-2,3},
				{2,3,4}
			},
			{
				{4,5,6,9},
				{1},
				{2,3}
					
			}
		};	           
		
		for(int[][] array2D : test)
		{
			for(int[] array1D : array2D)
			{
				for(int k : array1D)
				{
				  System.out.print(k);	
				}
				System.out.println();
			}
			System.out.println();
		}
				
	}
	
}

