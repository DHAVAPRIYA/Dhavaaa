import java.util.Scanner;


public class Even_Odd {
	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=in.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");
	}

}
