//program to print ascii value for given character
import java.util.Scanner;
public class Ascii
{ 
    public static void main(Frequency[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a character");
    char C1 = scan.next().charAt(0);
    int Asciivalue1 = C1;
    System.out.println("ASCII value of given character is:" +Asciivalue1);
    }
} 
    