import java.util.*;
public class InvertedStar {
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of row");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
