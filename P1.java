public class P1 {
	public static void PR(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.print("Prime");
		}
	}
	public static void main(String[] args) {
		PR(10);
	}
}