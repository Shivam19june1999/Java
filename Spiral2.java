import java.util.*;
public class Spiral2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2;

		//declaring size of matrix
		System.out.print("Enter the size s1:");
		s1=sc.nextInt();
		System.out.print("Enter the size s1:");
		s2=sc.nextInt();
		int matrix[][]=new int[s1][s2];

		//taking input for matrix elements by user
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print("Enter ("+i+","+j+") element:");
				matrix[i][j]=sc.nextInt();
			}
		}

		//Output
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		//spiral matrix output
		int startRow=0;
		int startCol=0;
		int endRow=matrix.length-1;
		int endCol=matrix[0].length-1;
		while (startRow<=endRow && startCol<=endCol) 
		{
			for(int k=startCol;k<=endCol;k++)
		{
			System.out.print(matrix[startRow][k]+" ");
		}
		for(int l=startRow+1;l<=endRow;l++)
		{
			System.out.print(matrix[l][endCol]+" ");
		}
		for(int k=endCol-1;k>=startCol;k--)
		{
			System.out.print(matrix[endRow][k]+" ");
		}
		for(int l=endRow-1;l>=startRow+1;l--)
		{
			System.out.print(matrix[l][startCol]+" ");
		}
		startRow++;
		startCol++;
		endCol--;
		endRow--;
		}
	}
}
