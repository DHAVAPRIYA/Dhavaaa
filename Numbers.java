import java.util.Scanner;


public class Numbers {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = in.nextLine();
	char a[] = str.toCharArray();
	int b[] = new int[a.length];
	for(int i = 0;i < a.length;i++)
	{
		 b[i] =  a[i];
		System.out.print(b[i]+"\t");		
	}
}
}
