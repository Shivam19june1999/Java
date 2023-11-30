import java.util.*;
public class CharPatt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='A';
		int n,r,c;
		System.out.print("Enter the value of n:");
		n=sc.nextInt();
		for(r = 1 ; r<=n ; r++){
			for(c = 1 ; c<=r ; c++){
				// System.out.print(c);//prints col
				System.out.print(ch);//prints row
				ch++;
			}
			System.out.println();
		}
		// for(r = 1 ; r<=n ; r++){
		// 	for(c = 1 ; c<=r ; c++){
		// 		System.out.print(ch);
		// 		ch++;
		// 	}
		// 	System.out.println();
		// }
	}
}
