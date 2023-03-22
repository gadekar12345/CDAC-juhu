import java.util.Scanner;

  class CircleArea{
	  
	 final double pi=3.14;
	   int r;
	 void Area(){
		 System.out.println("Area of circle is  "+(pi*r*r));
	 }
	  
	

	public static void main(String[] args) {
		
		// Circle
		/*int radius;
		  Double pi=3.14;
		 Double Area;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a radius");
       radius =sc.nextInt();
       Area=pi*radius*radius;
       System.out.println("Area is  " +Area);*/
       
		// Circle
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle ");
		
		CircleArea c=new CircleArea();
		 c.r=sc.nextInt();
		c.Area();
		CircleArea C1= new CircleArea();
		C1.r=30;
		C1.Area();
		
		
		
	 //Triangle
		/* Double breadth=10.0;
	Double height =20.0;
		Double Area;
		Area=  (height*breadth)/2;
		System.out.println("Area of triangle is  "+Area);*/
		
		
		
		
		
       


	}

}
