public class Kpattern{
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=(6-i) || j<=(i-4);j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
