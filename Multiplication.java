import java.util.Scanner;


public class Multiplication {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Multiplication Number : ");
	int n = in.nextInt();
	int s;
	for(int i = 1;i <= 10;i++)
	{
		s = i*n;
		System.out.println(i+"x"+n+"="+s);
	}
	
}
}
