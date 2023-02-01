package BasicJava;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		byte x = 20;
		int y = x;         // Implicit casting -> from lower to higher data type
		System.out.println(y);
		
		int z = 15;
		byte b = (byte)z;  // explicit casting -> from higher to lower data type
		System.out.println(b);
		
		
 
	}

}
