package Project;
import java.util.UUID;
import java.util.Scanner;

public class Employees extends Showroom implements utility{
	String emp_id;
	String emp_name;
	String emp_department;
	int emp_age;

	@Override
	public void get_details(){
		System.out.println("ID:"+emp_id);
		System.out.println("Name:"+emp_name);
		System.out.println("Age:"+emp_age);
		System.out.println("Department:"+emp_department);
		System.out.println("Showroom Name:"+showroom_name);
	}

	@Override
	public void set_details(){
		Scanner sc=new Scanner(System.in);
		UUID uuid=UUID.randomUUID();
		System.out.println();
		System.out.println("ENTER EMPLOYEE DETAILS");
		System.out.println();
		System.out.println("EMPLOYEE NAME: ");
		emp_name=sc.nextLine();
		System.out.println("EMPLOYEE AGE: ");
		emp_age=sc.nextInt();
		System.out.println("EMPLOYEE DEPARTMENT: ");
		emp_department=sc.nextLine();
		System.out.println("SHOWROOM NAME: ");
		showroom_name=sc.nextLine();
	}
}
// public class Showroom {
	
// }
