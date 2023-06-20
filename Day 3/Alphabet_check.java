package Assignments;
import java.util.*;
public class Alphabet_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter a charater");
		ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') ) {
			System.out.println("The entered value is a charater");
		}
		else {
			System.out.println("The entered value is not a charater");
		}

	}

}
