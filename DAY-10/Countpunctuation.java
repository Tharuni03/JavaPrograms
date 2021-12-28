import java.util.*;
import java.io.*;
public class Countpunctuation {
    public static void main(String[] args) {
        int count = 0;
        String str = "I Like chocolates,icecreams:?,pizza---|";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '|' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == ':')
            {
                count++;
            }
        }
        System.out.println("The number of punctuations exists the string is:" +count);   
    }
    
}

//OUTPUT:
//The number of punctuations exists the string is:8