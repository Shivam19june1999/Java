package Project;
import java.util.*;

public class Cars extends Showroom implements utility{
	String car_name;
	String car_color;
	String car_fuel_type;
	String car_type;
	String showroom_name;
	String car_transmission;
	int car_price;

	@Override
	public void get_details(){
		System.out.println("NAME:"+car_name);
		System.out.println("COLOR:"+car_color);
		System.out.println("CAR FUEL TYPE:"+car_fuel_type);
		System.out.println("CAR TYPE:"+car_type);
		System.out.println("TRANSMISSION:"+car_transmission);
		System.out.println("SHOWROOM NAME:"+showroom_name);
		System.out.println("PRICE:"+car_price);
	}

	@Override
	public void set_details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER CAR DETAILS");
		System.out.println();
		System.out.println("CAR NAME: ");
		car_name=sc.nextLine();
		System.out.println("CAR COLOR: ");
		car_color=sc.nextLine();
		System.out.println("CAR FUEL TYPE: ");
		car_fuel_type=sc.nextLine();
		System.out.println("CAR TYPE: ");
		car_type=sc.nextLine();
		System.out.println("CAR TRANSMISSION: ");
		car_transmission=sc.nextLine();
		System.out.println("SHOWROOM NAME: ");
		showroom_name=sc.nextLine();
		System.out.println("CAR PRICE: ");
		car_price=sc.nextInt();
	}
}
// public class Showroom {
	
// }
