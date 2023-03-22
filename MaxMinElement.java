package Arrays;

public class MaxMinElement {

	public static void main(String[] args) {
         
		//Max element
		int arr[]=new int[]{3,25,35,45,69,100};
	    int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
			if (arr[i]>max)
				max=arr[i];
		}
		System.out.println();
		
		System.out.println("max element is  :"+max);
		
		
		//Smaller element
		
		/*int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("min Element :"+min);*/
		
	}

}
