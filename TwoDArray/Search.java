package TwoDArray;
import java.util.*;
public class Search{
	public static int getsearch(int matrix[][],int key){
		int start=0;
		int end=matrix[0].length-1;
		while (start<matrix.length && end>=0) {
			if(matrix[start][end]==key){
				System.out.print("Element found at ("+start+","+end+") i.e. element is:"+matrix[start][end]);
				return 1;
			}
			else if(key<matrix[start][end]){
				end--;
			}
			else{
				start++;
			}
		}
		System.err.print("Not found");
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of s1:");
		int s1=sc.nextInt();
		System.out.print("Enter the size of s2:");
		int s2=sc.nextInt();
		int matrix[][]=new int[s1][s2];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print("("+i+","+j+") element:");
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Enter the element to search:");
		int key=sc.nextInt();
		System.out.println();
		getsearch(matrix,key);
	}
}