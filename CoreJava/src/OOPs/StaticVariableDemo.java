package OOPs;

class Mobile
{
	String brand;   //instance variable
	int price;
	static String name;  //static variable
	
	public void show()
	{
		System.out.println(brand+" "+price+" "+name);
	}
	
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 50000;
		obj1.name = "smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 20000;
		obj2.name = "smartphone";
		
		obj1.name = "PHONE";     // Changed name value for obj1 but automatically
		                         // changed for obj2 as well.
		
		obj1.show();
        obj2.show();
	}

}
