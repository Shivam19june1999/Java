package TwoDArray;
import java.util.*;
public class Diagonalsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		System.out.print("Enter the s1 size:");
		s1=sc.nextInt();
		System.out.print("Enter the s2 size:");
		s2=sc.nextInt();
		int matrix[][]=new int[s1][s2];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print("Enter ("+i+","+j+") element:");
				matrix[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				// System.out.print("Element at ("+i+","+j+") is:"+matrix[i][j]);
				// System.out.println();
				// if( i==0 && j==0 || i==1 && j==1 || i==2 && j==2)//my first approach
				if(i==j)//didi's approach
				{
					sum=sum+matrix[i][j];
				}
			}
		}
		System.out.print("The sum of primary diagonal is:"+sum);

	}
}
//BRUTE force method