package Strings;
import java.util.*;
public class Strngcmpr{
	public static void isEqual(String s1,String s2,String str){
		if(s1.equals(str)){
			System.out.println(s1 +" & "+ s2+" are equal.");
		}
		else{
			System.out.println(s1 +" & "+ s2+" are not equal.");
		}
	}
	public static void main(String [] shivam){
		Scanner sc=new Scanner(System.in);
		String s1="Shivam";
		String s2="Shivam";
		String str=new String("Shivam");
		// if(s1==s2){
		// 	System.out.println(s1 +" & "+ s2+" are equal");
		// }
		// else{
		// 	System.out.println(s1 +" & "+ s2+" are not equal.");
		// }
		// if(s1.equals(str)){
		// 	System.out.println(s1 +" & "+ s2+" are equal.");
		// }
		// else{
		// 	System.out.println(s1 +" & "+ s2+" are not equal.");
		// }
		isEqual(s1,s2,str);
	}
}