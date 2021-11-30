import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

   public class End {
     public static void main(String[] args) {
       String s="Hello World\nI am a file\nRead me until end of file";
       Scanner sc=new Scanner(s);
       for (int i=1; sc.hasNext(); i++ )
        System.out.println(i+ " "+sc.nextLine());
        }
      } 

//OUTPUT:   
//1 Hello World
//2 I am a file
//3 Read me until end of file


      