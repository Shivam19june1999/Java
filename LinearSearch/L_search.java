package LinearSearch;
import java.util.*;
public class L_search {
	public static int linearsearch(int numbers[],int key){
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==key){
				return i;
			}
		}
		return -1;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// int numbers[]={1,2,3,4,5,6,7,8,9};
		int size;
		System.out.print("Enter the array size:");
		size=sc.nextInt();
		int numbers[]=new int[size];
		for(int j=0;j<numbers.length;j++){
			System.out.print("fill number at "+j+" index:");
			numbers[j]=sc.nextInt();
		}
		System.out.print("Enter the number you want to find:");
		int key=sc.nextInt();
		int index=linearsearch(numbers, key);
		if(index==-1){
			System.out.println("Not Found");
		}
		else{
			System.out.println("Number is at index:"+index);
		}
	}
}
