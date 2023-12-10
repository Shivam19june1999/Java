// Program to transform binary into decimal
import java.util.*;
public class BtoD {
	public static void B(int n){
		int i=0;
		int dec=0,remainder;
		while (n!=0) {
			remainder=n%10;
			dec=dec+remainder*(int)Math.pow(2,i);
			n=n/10;
			i++;
		}
		System.out.print(dec);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		B(a);
    }
}
