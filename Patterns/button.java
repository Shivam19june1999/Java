import java.util.*;

public class button {
	public static void	main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) {
			case 1:System.out.print("Hello");
				break;
		    case 2:System.out.print("Namaste");
			    break;
		    case 3:System.out.print("Bonjour");
			default:System.out.println("Press right button");
				break;
		}
	}
}
