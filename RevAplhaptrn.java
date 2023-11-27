public class RevAplhaptrn {
	public static void main(String[] args) {
		int n=5,r,c;
		char ch='A';
		for(r=1;r<=n;r++){
			for(c=1;c<=(n-r+1);c++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
