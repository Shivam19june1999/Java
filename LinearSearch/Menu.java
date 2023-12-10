//Linear search for largest number
package LinearSearch;
import java.util.*;
public class Menu {
	public static int linearsearch(String menu[], String key){
		for(int i=0;i<menu.length;i++){
			if(menu[i].equals(key)){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu[]={"Samosa","Jalebi","Khasta","Kachori","paties"};
		System.out.print("Enter the food you want to search:");
		String key=sc.nextLine();
		int index=linearsearch(menu, key);
		if(index==  -1){
			System.out.print("Not Found");
		}
		else{
			System.out.print("Element found at "+index+" index");
		}
	}
}