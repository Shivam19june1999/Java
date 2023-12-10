//program to find largest number from array
package LinearSearch;
import java.util.*;
public class Large_search {
	public static int getlargest(int number[]){
		int key=Integer.MIN_VALUE;
		for(int i=0;i<number.length;i++){
			if(key<number[i]){
				key=number[i];
			}
		}
		return key;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of aaray:");
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<number.length;i++){
			System.out.print("Element at "+i+" index:");
			number[i]=sc.nextInt();
		}
		int largest=getlargest(number);
		System.out.print("Largest element of array is:"+largest);

	}
}
