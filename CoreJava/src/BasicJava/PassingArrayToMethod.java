package BasicJava;

public class PassingArrayToMethod {
	
	static void value(int[][] arr)
	{
		for(int[] i:arr)
		{
			for(int j:i)
				
			{
				System.out.print(j);
			}
			System.out.println();	
		}
	}
     
	public static void main(String[] args) {
		
		int[][] array =  {{1,2,3},{1,2},{1}};
		
		value(array);
		
	}
	
}
