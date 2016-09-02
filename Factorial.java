import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
	int i = 0,f = 1;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the factorial Number : ");
	int n = in.nextInt();
	while(n > 0)
	{
		f = f*(n-i);
		n--;
	}
	System.out.println("Factorial Number is : "+ f);
}
}
