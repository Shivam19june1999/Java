public class Damru {
public static void main(String[] args) {
	int n=10,r,c,space;
	for(r=1;r<=n;r++){
		for(space=1;space<=(r-1);space++){
			System.out.print(" ");
		}
		for(c=1;c<=(n-r+1);c++){
			System.out.print("* ");
		}
		System.out.println();
	}
	for(r=1;r<=n;r++){
		for(space=1;space<=(n-r);space++){
			System.out.print(" ");
		}
		for(c=1;c<=r;c++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
}