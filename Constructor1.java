public class Constructor1{
	
	static void sum(int i, int j)
	{
			int k= i+j;
			System.out.println("Sum="+k);
	}
	static void sum1(double i, double j)
	{
			double k= i+j;
			System.out.println("Sum1="+k);
	}
	
	
	

}
class MathOperDemo2
{
	public static void main(String args[])
	{
		Constructor1.sum(11,22);
		Constructor1.sum1(11.1,22.2);
		
	}
}