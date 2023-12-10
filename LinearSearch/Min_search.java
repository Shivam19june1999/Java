package LinearSearch;
import java.util.*;
public class Min_search {
	public static int getmin(int number[]){
		int key=Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++){
			if(key>number[i]){
				key=number[i];
			}
		}
		return key;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter the array size:");
		size=sc.nextInt();
		int number[]=new int[size];
			for(int i=0;i<number.length;i++){
				System.out.print("Enter array element at "+i+" index:");
				number[i]=sc.nextInt();
			}
		int smallest=getmin(number);
			System.out.print("Smallest element of array is:"+smallest);
	}
}
