package Assignments;
import java.util.*;
public class Count_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num,count=0;
		num = sc.nextInt();
		while(num>0) {
			num = num/10;
			count++;
		}
		System.out.println("The digits in the given number is "+count);

	}

}
