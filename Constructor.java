
public class Constructor {
           
	String name;
	int id;
	
	public Constructor() {
		name="Akshay";
		id=1111;
		
	}
	void display() {
		System.out.println(name+" "+id);
	}
	
	
}
 class constructorDemo{
	public static void main(String[] args) {
		Constructor c= new Constructor();
		c.display();
		
          
		}

}

