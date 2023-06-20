package Assignments;
import java.util.*;
public class Swap_two_Numbers {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping "+a+" "+b);

	}

}
