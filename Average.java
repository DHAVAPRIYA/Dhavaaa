import java.util.Scanner;


public class Average {
public static void main(String[] args) {
	int[] a = new int[100];
	int n;
	float avg = 0.0f;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Array Size : ");
	n = in.nextInt();
	System.out.println("Enter the Array Elementsss : ");
	for(int i = 0 ; i < n; i++)
	{
		a[i] = in.nextInt();
	}
	for(int i = 0;i < n ; i++)
	{
		avg += a[i]/2;
	}
	System.out.println(avg);
}
}
