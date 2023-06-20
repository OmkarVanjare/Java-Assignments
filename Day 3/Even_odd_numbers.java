package May_10_2023;
import java.util.*;
public class Nested_if_else_odd_even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		if (num%2==0) {
			
			System.out.println("The number entered is Even");
			
		}else {
			
			System.out.println("The number entered is Odd");
		}
		

	}

}
