package Assignments;
import java.util.*;
public class Series_Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of number");
		float n = sc.nextInt();
		float a=0;
		for(float i=1;i<=n;i++) {
			a+= 1/i;
			
		}
		System.out.println(a);
		

	}

}
