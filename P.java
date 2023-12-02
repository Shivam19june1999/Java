import java.util.*;
public class P{
	public static void prime(int n){
		int count=0;
		for(int i=1;i<=n;i++){//2
			
				if(n%i==0)
				// if(n%i==0)
				{
					count++;
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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
	}
}