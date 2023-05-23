package Assignments;
import java.util.*;
public class List_system_using_array {

	public static void main(String[] args) {
		int sum=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of the list");
	int size = sc.nextInt();
	String data[] = new String[size];
	int Data[] = new int[size];
	for (int i = 0; i < Data.length; i++) {
		System.out.println("Enter data at..."+(i+1));
		data[i] = sc.next();
		Data[i] =sc.nextInt();
		sum = sum + Data[i];
	}
	for (int i = 0; i < Data.length; i++) {
		System.out.println(data[i]+ ":-"+Data[i]);
	}
	System.out.println("Total:- "+sum);
 
	
	 
	 
	

	}

}
