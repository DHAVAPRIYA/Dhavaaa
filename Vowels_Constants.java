import java.util.Scanner;


public class Vowels_Constants {
public static void main(String[] args) {
	String a;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the String");
	a=in.next();
    int consonants = 0;
    int vowels = 0 ;
    for (int i = 0; i<a.length(); i++) {
    char letters = a.charAt(i);
    if (letters == 'A' || letters == 'a')
        vowels++;
    else if (letters != 'a' && letters != 'e' && letters != 'i' && letters != 'o' && letters != 'u')
        consonants++;
    }
        System.out.println ("Vowels:" + vowels  + "\nConsonants :" + consonants );

}
}
