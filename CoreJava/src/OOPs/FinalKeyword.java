package OOPs;

public class FinalKeyword {
	final int speedLimit = 60;
	int x = speedLimit;  // we can't change directly the value of final variable so
	                     // assigned it to another variable.
	void controlSpeed()
	{
		//speedLimit = 150;
		x=150;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalKeyword obj = new FinalKeyword();
        obj.controlSpeed();
	}

}
