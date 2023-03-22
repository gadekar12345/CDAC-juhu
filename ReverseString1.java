
public class ReverseString1 {

	public static void main(String[] args) {
		String str ="Akshay";
		String rev=" ";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println("Reversed string "+rev);

	}

}
