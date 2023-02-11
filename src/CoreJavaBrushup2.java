import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> s= new ArrayList();
		s.add("Cyra");
		s.add("Bivin");
		s.add("Josy");
		s.add("James");
		s.add("Cinta");
		s.add("Cyril");
		s.add("Biny");
		s.remove(5);
		System.out.println(s.get(5));
		System.out.println("***********************");
		for(String name:s) // enhanced for loop
		System.out.println(name);
		System.out.println("***********************");
		// Item is present or not
		System.out.println(s.contains("Josy"));
		//  Normal Array
		String [] arr= {"sebin","Babu","Emily"};
		System.out.println("***********************");
		//Converting  Array to arrayList
		List <String> newarrayList= Arrays.asList(arr);
		System.out.println(newarrayList.contains("Babu"));
	}

}
