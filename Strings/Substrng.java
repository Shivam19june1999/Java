package Strings;
import java.util.*;
public class Substrng {
	public static void getSubstring(String str,int si,int ei){
		String substr="";
		for(int i=si;i<ei;i++){
			substr=substr+str.charAt(i);
		}
		System.out.println(substr);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.nextLine();
		System.out.print("Enter the starting index :");
		int si=sc.nextInt();
		System.out.print("Enter the ending index :");
		int ei=sc.nextInt();
		getSubstring(str,si,ei);
	}
}
