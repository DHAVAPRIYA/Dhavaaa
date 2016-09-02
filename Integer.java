import java.util.Scanner;


public class Integer {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Reverse number : ");
	int n = in.nextInt();
	String str = n+"";
	StringBuffer br = new StringBuffer(str);
	br.reverse();
	String s = br.toString();
	System.out.println(s);
}

}