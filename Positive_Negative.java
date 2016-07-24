import java.util.Scanner;


public class Positive_Negative {
public static void main(String args[])
{
	int a,b;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	a=in.nextInt();
	if(a>0)
	{
		System.out.println("Positive integer");
	}
	else if(a<0)
	{
		System.out.println("Negative integer");
	}
	else
		System.out.println("Either Positive or Negative");
}
}
