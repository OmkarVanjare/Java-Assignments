package May_10_2023;

import java.util.*;

public class Nested_if_else_largest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		
		System.out.println("Enter 1st Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		num2 = sc.nextInt();
		
		System.out.println("Enter 3rd number");
		num3 = sc.nextInt();
		
		System.out.println("Enter 4th number");
		num4 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3 && num1 > num4) {
			
			System.out.println("Num1 is largest");
			
		}else {
			if (num2 > num1 && num2 > num3 && num2 > num4) {
				
				System.out.println("Num2 is larget");
				
			}else {
				if (num3 > num1 && num3 > num2 && num3 > num4) {
					
					System.out.println("Num3 is largest");
					
				}else {
					System.out.println("Num4 is largest");
				}
			}
		}

	}

}
