package BasicJava;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		 
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb  = new StringBuffer("Java");
		for(int i=0;i<10000;i++)
		{
			sb.append("code1");
		}
        System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime));
        
        startTime = System.currentTimeMillis();
		
		StringBuilder sb2  = new StringBuilder("Java");
		for(int i=0;i<10000;i++)
		{
			sb2.append("code1");
		}
        System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime));
	}

}
