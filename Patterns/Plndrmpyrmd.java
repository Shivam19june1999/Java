public class Plndrmpyrmd {
	public static void main(String[] args) {
		int n=5,r,c,space;
		for(r=1;r<=n;r++){
			for(space=1;space<=(n-r);space++)//for upper pyramid
			// for(space=0;space<=(r-1);space++)//for lower pyramid
			{
				System.out.print(" ");
			}
			for(c=r;c>=1;c--)
			// for(c=2;c<=(n-r+1);c++)
			{
				System.out.print(c);
			}
			for(c=2;c<=r;c++)
			// for(c=(n-r+1);c>=2;c--)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
