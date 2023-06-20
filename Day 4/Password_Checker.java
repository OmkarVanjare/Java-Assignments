package Assignments;
import java.util.*;
public class Password_Checker {

	public static void main(String[] args) {
		
		String password,password2,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password");
		password = sc.next();
		
		int attemps =0;
		boolean matched = false ;
		while(attemps <3 && !matched) {
			System.out.println("Re-enter your Password");
			password2 = sc.next();
			if(password.equals(password2)) {
				System.out.println("Starting MCQ exam");
				matched = true;
				break;
			}
			else {
				System.out.println("Incorrect password. Please try again");
				attemps++;
			}
		}
		if(!matched) {
			System.out.println("Maximum attemps reached.... Try againg later");
		}
		System.out.println("QUESTION 1");
		System.out.println("Who invented Java Programming?");
		System.out.println("a.  Guido van Rossum");
		System.out.println("b.  James Gosling");
		System.out.println("c.  Dennis Ritchie");
		System.out.println("d.  Bjarne Stroustrup");
		ans = sc.next();
		switch(ans) {
		case "a": System.out.println("Wrong answer");
		break;
		case "b": System.out.println("Correct answer");
		break;
		case "c": System.out.println("Wrong answer");
		break;
		case "d": System.out.println("Wrong answer");
		break;
		}
		if(ans.equals("b")) {
			System.out.println("QUESTION 2");
			System.out.println("Which component is used to compile, debug and execute the java programs?");
			System.out.println("a.  JRE");
			System.out.println("b.  JIT");
			System.out.println("c.  JDK");
			System.out.println("d.  JVM");
			ans = sc.next();
			switch(ans) {
			case "a": System.out.println("Wrong answer");
			break;
			case "b": System.out.println("Wrong answer");
			break;
			case "c": System.out.println("Correct");
			
			break;
			case "d": System.out.println("Wrong answer");
			break;		
		}
			if(ans.equals("c")) {
				System.out.println("You have cleared the MQC test");
			}
			else {
				System.out.println("Try next year");
			}
	}
}
}
