package OOPs;

class SmartPhone
{
	String brand;   //instance variable
	int price;
	static String name;  //static variable
	
	public void show()
	{
		System.out.println(brand+" "+price+" "+name);
	}
	static
	{
		name = "PHONE";
	}
	
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		SmartPhone obj1 = new SmartPhone();
		obj1.brand = "Apple";
		obj1.price = 50000;
		
		
		SmartPhone obj2 = new SmartPhone();
		obj2.brand = "Samsung";
		obj2.price = 20000;
		    // Changed name value for obj1 but automatically
		                         // changed for obj2 as well.
		
		obj1.show();
        obj2.show();
	}
}
