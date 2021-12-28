import java.util.*;
import java.io.*;
public class Duplicatecharacters {
    public static void main(String[] args) {
        String string1 = "I like chocolates";
        int count;
        char string[] = string1.toCharArray();
        System.out.println("Duplicate characters in a given string:");
        for(int i=0; i<string.length;i++)
        {
            count = 1;
            for(int j=i+1; j<string.length; j++)
            {
                if(string[i] == string[j] && string[i] != ' ')
            {
                count++;
                string[j] = '0';
            }            
        }
        if(count>1 && string[i] != '0')
        System.out.println(string[i]);
    }
    
    }
}

//OUTPUT:
//Duplicate characters in a given string:
//l
//e
//c
//o