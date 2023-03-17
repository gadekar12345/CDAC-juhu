class Star6{

	public static void main(String args[])
	{	
		for(int i=1;i<=5;i++)  //ROW
	    {
		for(int k=4;k>=i;k--)    //SPACE
		 {
			System.out.print(" ");
	   	}
		 	
		for(int j=1;j<=i;j++)     //COLUMN
		{
			System.out.print("* ");
		}	
		
		System.out.println();
	}
		
		
	
	}
	
}