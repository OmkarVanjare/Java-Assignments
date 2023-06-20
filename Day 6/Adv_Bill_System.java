package Assignments;
import java.util.*;
public class Adv_Bill_System {

	public static void main(String[] args) {
		String Sname;
		char choice='N';
		int size =100;
		int i = 0,sum =0;
		int Gsum=0; 
		int Tsum=0; 
		
		String Pname[] = new String[size];
		int Pprice[] = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shop name:- ");
		Sname = sc.nextLine();
		do {
			
			
			System.out.println("Enter food name "+(i+1));
			Pname[i]=sc.next();
			
			System.out.println("Add more (Y/N)");
			choice = sc.next().charAt(0);
			i++;
			
			
			
		}while(choice=='Y');
		size =i;
		System.out.println("The size of the list is "+size);
		System.out.println("-----PRICE-----");
		for(int j =0;j<size;j++) {
			System.out.println("Enter the price of "+Pname[j]);
			Pprice[j]=sc.nextInt();
			sum += Pprice[j];
		}
		System.out.println("Add GST (Y/N)");
		choice = sc.next().charAt(0);
		
		if(choice =='Y') {
			Gsum = (sum*18)/100;
			Tsum =  sum + Gsum;
			System.out.println("Printing Bill");
			System.out.println("-----"+Sname+"-----");
			for(int k =0;k<size;k++) {
				System.out.println((k+1)+"."+" "+Pname[k]+" :- "+Pprice[k]);
				
			}
			System.out.println("--------------------");
			System.out.println("Total:- "+sum);
			System.out.println("GST 18%:- "+Gsum);
			System.out.println("Total + GST:- "+Tsum);
		}
		else {	
			Tsum =  sum + Gsum;
			System.out.println("Printing Bill");
			System.out.println("-----"+Sname+"-----");
			for(int k =0;k<size;k++) {
				System.out.println((k+1)+"."+" "+Pname[k]+" :- "+Pprice[k]);
				
			}
			System.out.println("--------------------");
			System.out.println("Total:- "+sum);
			System.out.println("GST 0%:- "+Gsum);
			System.out.println("Total + GST:- "+Tsum);
			
		}

		
	}

}
