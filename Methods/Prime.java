// import java.util.*;
public class Prime{
	public static void prime(int n){
		// Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%j==0){
					count++;
				}
			}
		}
		if(count==2){
			System.out.print("Prime");
		}
		else{
			System.out.print("Not Prime");
		}
	}
	public static void main(String[] args) {
		prime(5);
	}
}