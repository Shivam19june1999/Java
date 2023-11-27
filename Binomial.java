public class Binomial {
	public static int factorial(int a){
		int facto=1;
		for(int i=1;i<=a;i++){
			facto=facto*i;
		}
		return facto;
	}
	public static int binocoff(int n,int r){
		int bofn=factorial(n);
		int bofa=factorial(r);
		int bma=factorial(n-r);
		int binomial=bofn/(bma*bofa);
		return binomial;
	}
	public static void main(String[] args) {
	int b=binocoff(5, 2);
	System.out.println(b);
	}
}
