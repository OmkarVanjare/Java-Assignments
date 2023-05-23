package Project;
import java.util.*;
public class Matrix_Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:-");
		int row = sc.nextInt();
		
		System.out.println("Enter number of Columns:-");
		int col = sc.nextInt();
		
		int dataA [][] = new int[row][col];
		int dataB [][] = new int[row][col];
		int DataAB [][] = new int [row][col];
		
		//user input
		
		System.out.println("Matrix A");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value at..."+i+j);
				dataA[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Matrix B");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value at..."+i+j);
				dataB[i][j]=sc.nextInt();
			}
			
		}
		
		//printing values
		System.out.println("Matrix A");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {	
				System.out.print(dataA[i][j]);
				
			}
			System.out.println();
			
		}
		System.out.println("Matrix b");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {	
				System.out.print(dataB[i][j]);
				
			}
			System.out.println();
			
		}
		
		//final output
		
		System.out.println("Addiion of 2 matrix is:-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				DataAB[i][j]= dataA[i][j]+dataB[i][j];
				System.out.print(" "+DataAB[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
