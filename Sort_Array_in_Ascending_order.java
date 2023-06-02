package Assignments;
import java.util.*;
public class Sort_Array_in_Ascending_order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list");
		int size = sc.nextInt();
		int a [] = new int [size];
		System.out.println("Enter numbers ");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		int temp;
		System.out.println("Array before sorting:-");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting:-");
		for(int element:a) {
			
			System.out.print(" "+element+" ");
		}
	}

}
