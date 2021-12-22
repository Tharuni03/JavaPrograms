import java.util.*;
import java.io.*;
public class Primenumber
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n==2||n==3)
 {
 System.out.println("prime number");
 }
 else if(n%2==0)
 {
 System.out.println("not a prime number");
 }
 else if(n%3==0)
 {
 System.out.println("not a prime number");
 }
 else if(n%4==0)
 { 
 System.out.println("not a prime number");
 }
 else
 {
 System.out.println("prime number");
 }
 sc.close();
 }
}

//OUTPUT:
//sample input
//3
//sample output
//prime number
