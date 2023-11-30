public class floyed {
	public static void main(String[] args) {
		int n=5,r,c,number=1;
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
