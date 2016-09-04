import java.util.Scanner;


public class Possible_Set {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the possible set : ");
	int n = in.nextInt();
	System.out.println("Enter the String : ");
	String str = in.nextLine();
	 str = in.nextLine();
	 String  str2 = "";
	 String str3 = "";
	 String str4 = "";
	 str2 = str.charAt(0)+"";
	 char[] b = new char[100];
	for(int i = 0; i < str.length();i++)
	{
	b[i] = str.charAt(i);
	}
	for(int i = 0;i <str.length();i++)
	{
		str3 = str2+b[i];
		System.out.println(str3);
	}
	
}
}
