package Assignments;
import java.util.*;
public class Vowel_or_Consonent {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u') {
			System.out.println(ch+" is Vowel");
		}
		else {
			System.out.println(ch+" is Consonent");
		}

	}

}
