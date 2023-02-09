package OOPs;

 class A                 // If declared final then it can't be extended!!
{
	public void show()   // If made it final then it can't be overridden!!
	{
		System.out.println("in A show");
	}
	public void config()
	{
		System.out.println("in A config");
	}
}

class B extends  A
{
	public void show()               // overrided/redefined method having
	                                 // same name,same parameters but in diff.
	                                 // classes
	{
		System.out.println("in B show");
	}
}

public class MehodOverriding {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.config();
		
	}

}
