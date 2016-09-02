import java.util.Scanner;


public class Reverse {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = in.nextLine();
		StringBuffer br = new StringBuffer(str);
		br.reverse();
		System.out.println(br);
	}

}
