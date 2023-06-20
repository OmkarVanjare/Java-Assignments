package Assignments;
import java.util.*;
public class Do_while_add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum,ans;
		
		System.out.println("Enter number 1");
		num1 = sc.nextInt();
		System.out.println("Enter number 2");
		num2 = sc.nextInt();
		do {
			sum = num1 +num2;
			System.out.println(num1 +" + "+num2 +" = "+sum);
			System.out.println("Do you want to perform this operation again? Enter 1 for yes and 2 for no");
			ans = sc.nextInt();
		}while(ans==1); 
		System.out.println("You have entered no");
	}

}
