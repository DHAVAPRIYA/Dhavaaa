import java.util.Scanner;


public class Largest_numbers {
public static void main(String[] args) {
	int a,b,c;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the three numbers:");
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("A is big");
	}
	else if(b>c)
	{
		System.out.println("B is big");
	}
	else
		System.out.println("C is big");
}
}
