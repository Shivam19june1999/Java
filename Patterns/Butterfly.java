public class Butterfly {
	public static void main(String[] args) {
		int n=9,r,c,s;
		//upper half of butterfly
		for(r=1;r<=n;r++){
			//first half
			for(c=1;c<=r;c++){
				if(r==1 || c==1 || c==r)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			//for space
			int space=2*(n-r);
			for(s=1;s<=(space);s++){
				System.out.print(" ");
			}
			//2nd half
			for(c=1;c<=r;c++){
				if(c==1||r==1|| c==r)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			//lower half
			
			System.out.println();
		}
		//lower half of butterfly
		for(r=n;r>=1;r--){
			for(c=1;c<=r;c++){
				if(r==1 || c==1 || c==r)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			//for space
			int space=2*(n-r);
			for(s=space;s>=1;s--){
				System.out.print(" ");
			}
			for(c=1;c<=r;c++){
				if(r==1 || c==1 || c==r)
				System.out.print("*");
				else
				System.out.print(" ");
			}
				System.out.println();
		}
	}
}
