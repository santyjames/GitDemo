
public class CoreJavaBrushUP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a =5;
		 String message ="You are my Friend";
		 char letter = 'C';
		 boolean f =true;
		 System.out.println(a +" " + "is the integer number");
		 
 // Arrays
		 
		// one way
		int[] arr1= new int[5];
		arr1[0] =1;
		arr1[1]=10;
		arr1[2]=20;
		arr1[3]=30;
		arr1[4]=40;
		
		// other way
		int[] arr2= {20,50,40,24,30};
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
	
		// String array 
		 String [] arr= new String[2];
		 arr[0]="new";
		 arr[1]="World";
		 System.out.println(arr[0]);
		 
	
	
	// For loop
		// Length of array : arr1.length
	 for(int i=0;i<arr1.length;i++) {
		 System.out.println(arr1[i]);
		 
	 }
	 
	 
	 // Enhanced for loop syntax
	 for(int n :arr2) {
		 System.out.println(n);
	 }
	}
}
