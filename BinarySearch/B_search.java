package BinarySearch;
import java.util.*;
public class B_search {
	public static int binarysearch(int arr[],int key){
		int start=0,end=arr.length-1;
		while (start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key){
				return mid;
			}
			if(arr[mid]<key){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={2,4,6,8,10,12,12,14};
		System.out.print("Enter element to search:");
		int key=sc.nextInt();
		System.out.print("Element found at index:"+binarysearch(arr,key));
	}
}
