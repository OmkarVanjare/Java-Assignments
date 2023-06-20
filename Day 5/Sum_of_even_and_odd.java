package Assignments;
import java.util.*;
public class Sum_of_even_and_odd {

	public static void main(String[] args) {
		int start,end;
		int sum1 =0,sum2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start value and end value");
		start = sc.nextInt();
		end  = sc.nextInt();
		for(int i = start ;i<=end;i++) {
			if(i%2==0) {
				sum1 = sum1 +i;
			}
			else {
				sum2 = sum2 +i;
			}
		}
		System.out.println("Sum of even numbers:- "+sum1);
		System.out.println("Sum of odd numbers:- "+sum2);
		

	}

}
