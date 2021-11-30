import java.math.*;
import java.util.Scanner;
public class Initializer
{ 
 static int b,h;
 static
 {
 Scanner sc = new Scanner(System.in);
 b=sc.nextInt();
 h=sc.nextInt();
 }
 public static void main(String args[])
 {
  if(b>=-100 && b<=100)
   {
    if(h>=-100 && h<=100)
     {
     System.out.println(b*h);
     }
   }
   else
   {
     System.out.println("java.lang.Exception:breadth and height must be positive");
   }
 }
}

//OUTPUT:
//567 78
//java.lang.Exception:breadth and height must be positive