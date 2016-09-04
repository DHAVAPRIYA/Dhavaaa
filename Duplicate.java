import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Duplicate {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = in.nextLine();
	String[] str1 = str.split(" ");
	Set< String> obj = new HashSet<String>();
	for(int i = 0;i < str1.length;i++)
	{
		obj.add(str1[i]);
	}
	for(String t : obj)
	{
		System.out.println(t);
	}
}
}
