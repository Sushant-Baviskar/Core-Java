package BasicJava;

class Circle
{
	public double getPi()
	{
		return 3.14;
	}
}
public class PassByRef {
    public void calcArea(Circle objPi,double rad)
    {
    	double area = objPi.getPi()*rad*rad;
    	System.out.println("Area of circle is :"+area);
    }
	public static void main(String[] args) {
		
		PassByRef p1 = new PassByRef();
		p1.calcArea(new Circle(), 2);
	}

}
