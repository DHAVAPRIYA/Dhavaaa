import java.util.Scanner;


public class Remove_vowels {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = in.nextLine();
	String str1 = "";
	String str2 = "";
	char[] a = new char[str.length()];
	for(int i = 0;i < str.length();i++)
	{
		
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			
			str1 += str.charAt(i);
		}
		else
		{
			str2 += str.charAt(i);
		}
	}
	System.out.println(str2);
	
}
}
