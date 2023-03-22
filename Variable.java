
public class Variable {
           
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
	
	public static void main(String[] args) {
		String s ="Tarzan";
          
		Variable v=new Variable();
		System.out.println("instance variable " +v.a);
		System.out.println("static  variable " +b);
        v.display();  //instance function
        show(); // static method call we no need call with ref 
        System.out.println(s);// local variable (we can access directly)
       System.out.println(v.calulate());//instance function
        }

}
