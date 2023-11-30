import java.util.*;
public class Halgpyramid {
	public static void main(String[] args) {
		// int r,c;
		// for(r=1;r<=5;r++){
		// 	for(c=1;c<=r;c++){
		// 		System.out.print(c);
		// 	}
		// 	System.out.println();
		// }
		Scanner sc=new Scanner(System.in);
		int n,r,c;
		System.out.print("Enter the value of n:");
		n=sc.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=(n-r+1);c++){
				System.out.print(c);//prints column
				System.out.print(r);//prints row
			}
			System.out.println();
		}
	}
}
