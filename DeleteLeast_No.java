import java.util.Scanner;


public class DeleteLeast_No {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int a = in.nextInt();
	int i = 0;
	int count = 0;
	int t = 0 ;
	int[] f = new int[100];
	String str = "";
	int[] temp = new int[100];
	while(a!=0)
	{
		temp[i] = a%10;
		f[i] = a%10;
		count++;
		i++;
		a = a/10;
	}
	for(int j = 0 ;j < count ;j++)
	{
		for(int k = j+1 ; k < count ; k++)
		{
		if(temp[k] < temp[j])
		{
			int tmp ;
			tmp = temp[k];
			temp[k] = temp[j];
			temp[j] = tmp;
		}	
		}
		System.out.println(temp[j]);
	}
	
	for(int k = 0 ; k < 1; k++)
	{
		if(temp[k] < temp[k+1])
		{
			t = temp[k+1];
		}
	}
	for( int h = 0 ; h < count ; h++)
	{
		 str += f[h]+"";
		 
	}
	String str1 = str.substring(t,str.length());
	StringBuffer br = new StringBuffer(str1);
	 br.reverse();
	 String str2 = br.toString();
	System.out.println(str2);
	
}
}
