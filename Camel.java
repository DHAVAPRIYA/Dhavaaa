import java.util.Scanner;


public class Camel {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s = in.nextLine();
	char y = s.toUpperCase().charAt(0);
	String str = s.substring(1,s.length());
	System.out.println(y+str);
}
}
