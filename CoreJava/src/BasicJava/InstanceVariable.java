package BasicJava;

class Student
{
	 int roll;
	 String name;
}

public class InstanceVariable {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.roll=1;
		obj.name="sushant";
		System.out.println(obj.roll);
		System.out.println(obj.name);
	}

}
