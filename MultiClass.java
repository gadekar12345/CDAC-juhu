
public class MultiClass {
           
	int a=10;   // instance variable
	static int b=30; // static variable
	int x=5; //instance variable
	
	void display() {
		System.out.println("instance variable is "+a);
	}
	
	int calulate() {
		int c= x*x*x;
		return c;
	}
	static void show() {
		System.out.println("static variable "+b);
	}
}
 class MultiClassDemo{
	public static void main(String[] args) {
		String s ="Tarzan";
		
          
		MultiClass v=new MultiClass();
		System.out.println("instance variable " +v.a);
		//System.out.println("static  variable " +b);
         v.display();  //instance function
      MultiClass. show(); // for static method call in other class we need to
      //classname.method name or we can call with help of ref also ie. v.show()  
        System.out.println(s);// local variable (we can access directly)
       System.out.println(v.calulate());//instance function
        }

}
