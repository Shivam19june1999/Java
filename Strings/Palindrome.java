package Strings;
import java.util.*;
public class Palindrome{
	public static boolean isPalindrome(String str)
	{
		int n=str.length();
		for(int i=0;i<=str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(n-i-1)){
				System.out.println("No, not a palindrome string.");
				return false;
			}
		}
		System.out.println("Yes, it is palindrome string.");
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string to check:");
		String str=sc.nextLine();
		isPalindrome(str);
	}
}
