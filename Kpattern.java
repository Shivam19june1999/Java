public class Kpattern {
	public static void main(String[] args) {
		int n = 11;
		int h=(n+1)/2;
		int i,j;
		for(i=1;i<=n;i++){
		for(j=1;j<=(h-i+1) || j<=(i-h+1);j++){
		System.out.print("* ");
		}
		System.out.print("\n");
		}
		
        // for (int i = 0; i < r; i++) {
        //     for (int j = i; j <=(r / 2); j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     for (int j = (r/2); j <= i; j++) {
        //         System.out.print("* ");
        //     }
        // }
	}
}
