//user defined array 
package Arrays;
import java.util.*;
public class Array {
	// public static void update(int marks[]){
	// 	for(int i=0;i<marks.length;i++){
	// 		marks[i]=marks[i]+1;
	// 	}
	// }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of marks[]:");
		int size=sc.nextInt();
		int marks[]=new int[size];
		System.out.println("Length of marks[] array is:"+ marks.length);//to get array length
		int i;
		for(i=0;i<marks.length;i++){
			System.out.print("Enter the array elements at "+i+" index:");
			marks[i]=sc.nextInt();
		}
		// update(marks);
		for(i=0;i<marks.length;i++){
			System.out.println("Element at "+i+" index is:"+marks[i]);
		} 
		int sum=0;
		for(i=0;i<marks.length;i++){
			sum=sum+marks[i];
		}
		System.out.print("The sum of all elements in array is:"+sum);
	}
}
