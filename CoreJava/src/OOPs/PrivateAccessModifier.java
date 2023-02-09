package OOPs;

class PrivateExample
{
	private int x = 10;
	public void show()     // if I declare it public then it will be accessible     
	{
		System.out.println(x);
	}
}
public class PrivateAccessModifier {

	public static void main(String[] args) {
		PrivateExample obj = new PrivateExample();
		obj.show();

	}

}
