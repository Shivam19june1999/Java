import java.util.*;
public class Squarepattern {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r,c,i,j;
		System.out.print("Enter the row and column values:");
		r=sc.nextInt();
		c=sc.nextInt();
		for(i=1;i<=r;i++){
			for(j=1;j<=c;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
