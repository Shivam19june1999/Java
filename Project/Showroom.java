package Project;
// import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements utility{
	String showroom_name;
	String showroom_address;
	String manager_name;
	int total_employees;
	int total_cars_in_stocks=0;

	@Override
	public void get_details(){
		System.out.println("Showroom Name:"+showroom_name);
		System.out.println("Showroom Address:"+showroom_address);
		System.out.println("Manager Name:"+manager_name);
		System.out.println("Total Employees:"+total_employees);
		System.out.println("Total Cars In Stocks:"+total_cars_in_stocks);
	}

	@Override
	public void set_details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SHOWROOM DETAILS");
		System.out.println();
		System.out.println("SHOWROOM NAME: ");
		showroom_name=sc.nextLine();
		System.out.println("SHOWROOM ADDRESS: ");
		showroom_address=sc.nextLine();
		System.out.println("MANAGER NAME: ");
		manager_name=sc.nextLine();
		System.out.println("TOTAL NO. OF EMPLOYEES: ");
		total_employees=sc.nextInt();
		System.out.println("TOTAL CARS IN STOCKS: ");
		total_cars_in_stocks=sc.nextInt();
	}
}
// public class Showroom {
	
// }
