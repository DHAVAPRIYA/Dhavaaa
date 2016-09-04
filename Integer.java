import java.util.Scanner;


public class Integer {
public static void main(String[] args) {
	int decimal = 0;
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
    String str1 = str.toUpperCase();
    for(int x = 0;x<str1.length();x++)
    {
        char ch = str.charAt(x);
        switch (ch)
        {
        case 'X':
            decimal += 10;
            break;

        case 'V':
            decimal += 5;
            break;

        case 'I':
            decimal += 1;
            break;
        }
    }
  System.out.println(decimal);
}	

}