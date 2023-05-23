package Project;
import java.util.*;
public class Salary_system {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String Name;
	 int Monthly_Salary, Leave, Month, Year, TDS;
	 System.out.println("Enter Employee name");
	 Name = sc.nextLine();
	 System.out.println("Enter Mothly Salary");
	 Monthly_Salary = sc.nextInt();
	 System.out.println("Enter Number of leaves");
	 Leave = sc.nextInt();
	 System.out.println("Enter Month");
	 Month =sc.nextInt();
	 System.out.println("Enter Year");
	 Year = sc.nextInt();
	 System.out.println("Enter TDS");
	 TDS = sc.nextInt();
	 
	 
	 if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12  ) {
		 int Day = Monthly_Salary / 31;
		 int Leave_Amount = Day * Leave;
		 int TDS_Amount = (Monthly_Salary*TDS)/100;
		 int Final_salary = Monthly_Salary - Leave_Amount - TDS_Amount;
		 int CTC = Monthly_Salary * 12;
		 System.out.println("Month"+Month);
		 System.out.println("Employee Name:-"+Name);
		 System.out.println("Employee Monthly Salary:-"+Monthly_Salary);
		 System.out.println("Leave Amount:-"+Leave_Amount);
		 System.out.println("TDS Amount:-"+TDS_Amount);
		 System.out.println("Final Salary:-"+Final_salary);
		 System.out.println("CTC (Yearly Salary)"+CTC); 
	 } else {
		 if(Month == 4 || Month == 6 || Month== 9 || Month == 11) {
			 int Day = Monthly_Salary / 30;
			 int Leave_Amount = Day * Leave;
			 int TDS_Amount = (Monthly_Salary*TDS)/100;
			 int Final_salary = Monthly_Salary - Leave_Amount - TDS_Amount;
			 int CTC = Monthly_Salary * 12;
			 System.out.println("Month"+Month);
			 System.out.println("Employee Name:-"+Name);
			 System.out.println("Employee Monthly Salary:-"+Monthly_Salary);
			 System.out.println("Leave Amount:-"+Leave_Amount);
			 System.out.println("TDS Amount:-"+TDS_Amount);
			 System.out.println("Final Salary:-"+Final_salary);
			 System.out.println("CTC (Yearly Salary)"+CTC); 
		 }
		 else {
			 if (Month ==2 && Year%4==0) {
				 int Day = Monthly_Salary / 29;
				 int Leave_Amount = Day * Leave;
				 int TDS_Amount = (Monthly_Salary*TDS)/100;
				 int Final_salary = Monthly_Salary - Leave_Amount - TDS_Amount;
				 int CTC = Monthly_Salary * 12;
				 System.out.println("Month"+Month);
				 System.out.println("Employee Name:-"+Name);
				 System.out.println("Employee Monthly Salary:-"+Monthly_Salary);
				 System.out.println("Leave Amount:-"+Leave_Amount);
				 System.out.println("TDS Amount:-"+TDS_Amount);
				 System.out.println("Final Salary:-"+Final_salary);
				 System.out.println("CTC (Yearly Salary)"+CTC); 
			 }
			 else {
				 int Day = Monthly_Salary / 28;
				 int Leave_Amount = Day * Leave;
				 int TDS_Amount = (Monthly_Salary*TDS)/100;
				 int Final_salary = Monthly_Salary - Leave_Amount - TDS_Amount;
				 int CTC = Monthly_Salary * 12;
				 System.out.println("Month"+Month);
				 System.out.println("Employee Name:-"+Name);
				 System.out.println("Employee Monthly Salary:-"+Monthly_Salary);
				 System.out.println("Leave Amount:-"+Leave_Amount);
				 System.out.println("TDS Amount:-"+TDS_Amount);
				 System.out.println("Final Salary:-"+Final_salary);
				 System.out.println("CTC (Yearly Salary)"+CTC); 
				 
			 }
		 }
	 }
	 }
}
