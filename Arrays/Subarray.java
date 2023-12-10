package Arrays;

public class Subarray {
	public static void getsubarray(int arr[]){
		int Total=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			// int start=i;
			for(int j=i;j<arr.length;j++){
				// int end=j;
				for(int l=i;l<=j;l++){
					System.out.print(arr[l]+" ");
					// sum=sum+arr[l];
				}
				// System.out.println(sum);
				Total++;
				System.err.println();
			}
			System.out.println();
		}
		System.err.println("Total subarrays are:"+Total);
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		getsubarray(arr);
	}
}
