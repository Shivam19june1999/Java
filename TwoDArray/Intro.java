package TwoDArray;
import java.util.*;
public class Intro {
	//from LOC 4 to 16, Linear search of element in 2D Array.
	public static int search(int arr[][],int key){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==key){
					System.out.print("Element Found at ("+i+","+j+")"+" index.");
					// return 1;
				}
			}
		}
		System.out.print("Element not found at any index");
		return -1;
	}
	// from LOC 18 to 28,Largest number of element in 2D Array.
	public static int getmax(int arr[][]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(max<arr[i][j]){
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	// from LOC 30 to 40,smallest number of element in 2D Array.
	public static int getmin(int arr[][]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(min>arr[i][j]){
					min=arr[i][j];
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		System.out.print("Enter size of s1:");//row size
		s1=sc.nextInt();
		System.out.print("Enter siz of s2:");//column size
		s2=sc.nextInt();
		int arr[][]=new int[s1][s2];
		System.out.print("Size of arr[s1][s2] is:"+s1+"*"+s2);
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("Enter ("+i+","+j+")"+" element:");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int key;
		System.out.print("Enter the element to search:");
		key=sc.nextInt();
		search(arr, key);//Key search function call
		System.out.println();
		System.out.print("The largest element is:"+getmax(arr));//Largest number function call
        System.out.println();
		System.out.print("The smallest element is:"+getmin(arr));//Smallest number function call

	}
}
