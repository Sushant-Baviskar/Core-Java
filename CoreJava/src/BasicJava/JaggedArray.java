package BasicJava;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {5,6,7,8};
		int y[] = {6,7};
		int z[] = {9,8,7};
		
		int p[][] = { {5,6,7,8},{6,7},{9,8,7}};
		
		
		for(int m=0;m<p.length;m++)
		{
			for(int n=0;n<p[m].length;n++)
			{
				System.out.print(p[m][n]);
			}
			System.out.println();
		}
		
		
		//OR

		for(int i[]:p)
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
	}

}
