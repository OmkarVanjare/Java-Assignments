package Assignments;
import java.util.*;
import java.util.Iterator;

public class Multiplication_of_matrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:-");
		int row = sc.nextInt();
		System.out.println("Enter number of columns:-");
		int col = sc.nextInt();
		int dataA[][] = new int[row][col];
		int dataB[][] = new int [row][col];
		int dataC[][] = new int [row][col];
		
		//user input
		System.out.println("Matrix A");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value at..."+i+" "+j);
				dataA[i][j]=sc.nextInt();
				
			}
			System.out.println();
			
		}
		System.out.println("Matrix B");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value at..."+i+" "+j);
				dataB[i][j]=sc.nextInt();
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		//printing
		System.out.println("Matrix A");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(dataA[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("Matrix B");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(dataB[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix C");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				for (int k = 0; k < row; k++) {
					dataC[i][j]+= dataA[i][k]*dataB[k][j];
					
				}
							
				
				System.out.print(" "+dataC[i][j]+" ");
				
				
			}
			System.out.println();
			
		}

	}

}
