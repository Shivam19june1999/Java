public class Facto {
	public static int factorial(int a){
		int facto=1;
		// for(int i=1;i<=a;i++){
		// 	facto=facto*i;
		// }
		for(int i=a;i>=1;i--){
			facto=facto*i;
		}
		return facto;
	}
	public static void main(String[] args) {
		int a=4;
		int factor=factorial(a);
		System.out.println(factor);
	}
}
