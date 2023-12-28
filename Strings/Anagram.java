package Strings;
import java.util.*;
public class Anagram {
	public static void main(String[]shivam){
		Scanner sc=new Scanner(System.in);
		String s1="race";
		String s2="care";
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)!=(s2.charAt(j))){
					break;
					// System.out.println("not");
				}
				else{
					System.out.print("Same words of string matched.");
				}
			}
		}
	}
}
