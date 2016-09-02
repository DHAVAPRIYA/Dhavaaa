import java.util.Scanner;


public class Conversion {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = in.nextLine();
	int[] sum = new int[str.length()];
	
	for(int i = 0 ; i < str.length();i++)
	{
		sum[i] = str.charAt(i);
	}
	for(int j = 0;j < str.length();j++)
	{
		System.out.println(sum[j]);
	}
}
}
