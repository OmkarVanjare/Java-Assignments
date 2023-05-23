package Project;
import java.util.*;
public class Transpose_of_Matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:-");
		int row = sc.nextInt();
		System.out.println("Enter number of columns:-");
		int col = sc.nextInt();
		
		int dataA [][] = new int[row][col];
		
		//user input
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value at...."+i+j);
				dataA[i][j]=sc.nextInt();
				
			}
			System.out.println();
			
		}
		
	
		System.out.println("Original Matrix:-");
		for (int i = 0; i < dataA.length; i++) {
			for (int j = 0; j < dataA.length; j++) {
				System.out.print(" "+dataA[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose of Matrix:-");
		for (int i = 0; i < dataA.length; i++) {
			for (int j = 0; j < dataA.length; j++) {
				System.out.print(" "+dataA[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}
