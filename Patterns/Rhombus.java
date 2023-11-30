public class Rhombus {
	public static void main(String[] args) {
		int n=5,r,c,space;
		for(r=1;r<=n;r++){
			for(space=1;space<=(n-r);space++){
				System.out.print(" ");
			}
			for(c=1;c<=5;c++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
