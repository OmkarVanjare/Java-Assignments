package Assignments;
import java.util.*;

class bill{
	
	void Bill(String name[], int price[]) {
		for (int i = 0; i < price.length; i++) {
			System.out.println((i+1)+" "+name[i]+" "+price[i]);
		}
	}
	
	void Total(int price[], int GST) {
		int sum=0;
		int gst,total;
		for (int i = 0; i < price.length; i++) {
			sum +=price[i];
		}
		
		gst = (sum*GST)/100;
		total = sum + gst;
		System.out.println("Total = "+sum+"/-");
		System.out.println("--------------");
		System.out.println("GST "+GST+"% = "+gst+"/-");	
		System.out.println("--------------");
		System.out.println("Total + GST ="+total+"/-");
		
	}
	
	
	
}

public class Billing_System {

	public static void main(String[] args) {
		int gst=0;
		Scanner sc = new Scanner(System.in);
		bill obj = new bill();
		System.out.println("Enter Shop name:-");
		String Name = sc.nextLine();
		
		System.out.println("Enter the size of list");
		int size = sc.nextInt();
		
		String data[] = new String[size];
		int Data[] = new int[size];
		
		for (int i = 0; i < Data.length; i++) {
			System.out.println("Enter Product "+(i+1));
			data[i] = sc.next();
		}
		
		for (int i = 0; i < Data.length; i++) {
			System.out.println("Enter price of "+data[i]);
			Data[i] = sc.nextInt();
		}
		
		
		
		System.out.println("Add GST (Enter 1 for yes or Enter 2 for no)");
		int Choice = sc.nextInt();
		
		
		if(Choice==1) {
			
			System.out.println("Enter GST:-");
			gst = sc.nextInt();	
		}
		else {
			System.out.println("GST not applied");
		}
		
		
		
		
		System.out.println("-----BILL-----");
		System.out.println("--"+Name+"--");
		obj.Bill(data, Data);
		System.out.println("--------------");
		obj.Total(Data,gst);
	
		
	}
}
