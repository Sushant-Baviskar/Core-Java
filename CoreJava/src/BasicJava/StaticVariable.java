package BasicJava;

class StudentNew
{
	 static int roll;
	 static String name;
}

public class StaticVariable {

	public static void main(String[] args) {
		StudentNew.roll=1;
		StudentNew.name="sushant";
		
		System.out.println(StudentNew.roll);
		System.out.println(StudentNew.name);		

	}

}
