package Arrays;

public class Array1 {

	public static void main(String[] args) {
		//int arr[]=new int[] {1,5,4,6,8,7,3};          // int array
		String arr[]=new String[] {"Akshay","pooja"};    // String array
		//for(int i=0;i<arr.length;i++) {
		//	System.out.print(arr[i]+" ,");
		for (String s :arr) 
		{
			System.out.print(s+" ");

		}
		System.out.println();
		System.out.println("lenght of array is = "+arr.length);


	}

}
