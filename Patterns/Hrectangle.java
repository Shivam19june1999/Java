public class Hrectangle {
	public static void main(String[] args) {
		int r=4,c=5,i,j;
		for(i=1;i<=r;i++){
			for(j=1;j<=c;j++){
				if(i==1 || j==1 || i==r || j==c ){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				// System.out.print(" ");
			}
			System.out.println();
		}
	}
}
