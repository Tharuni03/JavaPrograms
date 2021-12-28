import java.util.*;
import java.io.*;
public class Countcharacter {
    public static void main(String[] args) {
        String string = "It is a december month";
        int count = 0;
        for(int i=0; i<string.length(); i++)
        {
            if(string.charAt(i)!=' ')
            count++;
        }
        System.out.println("The number of characters in a string:"+count);
    }
    
}
//OUTPUT:
//The number of characters in a string:18
