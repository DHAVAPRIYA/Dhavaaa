import java.util.Scanner;


public class Same_Index {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Size of Array : ");
	int n = in.nextInt();
	int[] a = new int[n];
	for(int i = 0 ; i < n ; i++)
	{
		a[i] = in.nextInt();
	}
	for(int j = 0; j < n ; j++)
	{
		if( j == a[j])
		{
			System.out.println((j+" The Number equals it's Index "+a[j]));
		}
	
	}
}
}
