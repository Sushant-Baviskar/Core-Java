package BasicJava;

public class StringComplete {
	
	public static void method1(String s1)
	{
		s1 = s1 + "JAVA";
	}
	
	public static void method2(StringBuffer s2)
	{
		s2.append("JAVA");
	}
	
	public static void method3(StringBuilder s3)
	{
		s3.append("JAVA");
	}

	public static void main(String[] args) {
		
		String s1 = "HELLO";
		method1(s1);
		System.out.println(s1);
		
		
		StringBuffer s2 = new StringBuffer("HELLO");
		method2(s2);
		System.out.println(s2);
		
		
		StringBuilder s3 = new StringBuilder("HELLO");
		method3(s3);
		System.out.println(s3);
		
		

	}

}
