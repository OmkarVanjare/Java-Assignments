package Assignments;
import java.util.*;
public class Alpha_half_pyramid {
	
	public static void main(String[] args) {
	int row;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows:- ");
	row = sc.nextInt();
	int alphabet = 65;
	for(int i =1;i<=row;i++) {
		for(int j = 1; j<=i;j++) {
			System.out.print((char)alphabet+" ");
			alphabet++;
		}
		alphabet++;
		System.out.println();
	}

	
	}
}
