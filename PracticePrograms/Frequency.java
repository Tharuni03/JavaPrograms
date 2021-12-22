//program to find a frequency of a character
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        String clgname = "ashoka college of engineering";
        char ch = 'i';
        int count = 0;
        for(int i=0; i<clgname.length(); i++)
        {
            if(ch==clgname.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of char:" +count);
        

    }   
}
