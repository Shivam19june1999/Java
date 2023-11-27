public class pyrmd {
	public static void main(String[] args) {
		int n=5,r,c,space;
		for(r=1;r<=n;r++){
			for(space=1;space<=(5-r);space++){
				System.out.print(" ");
			}
			for(c=1;c<=r;c++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
