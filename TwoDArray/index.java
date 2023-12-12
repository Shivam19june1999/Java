//particular index print
package TwoDArray;
public class index {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if((i+j)%2==0){
					if(i==1 && j==1)
					{
						System.out.print(" ");
					}
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}