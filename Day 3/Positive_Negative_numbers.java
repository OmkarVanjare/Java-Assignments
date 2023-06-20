package Assignments;
import java.util.*;
public class Positive_Negative_numbers {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.format("%d is a positive number",number);
		}
		else if(number== 0){
			System.out.format("%d is nor positive nor negative number",number);

		}
		else {
			System.out.format("%d is a negative number",number);
		}
		

	}

}
