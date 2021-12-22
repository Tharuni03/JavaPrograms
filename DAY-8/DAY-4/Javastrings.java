import java.io.*;
import java.util.*;
 class Javastrings
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String a=sc.nextLine();
 String b=sc.nextLine();
 System.out.println(a.length());
 System.out.println(b.length());
 System.out.println(a.length()+b.length());
 int c=a.compareTo(b);
 if(c<0)
 {
 System.out.println("no");
 }
 else
 {
 System.out.println("yes");
 }
 System.out.println(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+" ");
 System.out.println(b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase());
 }
 }
 
//OUTPUT:
//java
//strings
//4
//7
//11
//no
//Java
//Strings

 