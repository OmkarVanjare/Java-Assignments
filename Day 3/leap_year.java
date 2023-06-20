package May_10_2023;
import java.util.*;
public class Nested_if_else_leap_year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a Year");
		num = sc.nextInt();
		
		if (num%4==0) {
			
			System.out.println("It is a Leap Year");
			
		}else {
			
			System.out.println("It is not a Leap Year");
		}
		
		

	}

}
