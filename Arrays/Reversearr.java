package Arrays;

import java.util.Scanner;

public class Reversearr {
	public static void reversearr(int arr[]){
		int first=0,last=arr.length-1;
		while (first<last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
			last--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		// int arr[]={1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			System.out.print("fill "+i+" index element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse array elements are");
		reversearr(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(+arr[i]+" ");
		}
	}
}
