class MathOper{
	
       int sum(int i, int j)
	{
			int k= i+j;
			System.out.println("Sum="+k);
			return k;
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
		MathOper m=new MathOper();
		
		
		m.sum(10, 15);  //pass by value by instance function
		
		
		MathOper.sum1(11.1,22.2);// pass by value from static method 
		
	}
}