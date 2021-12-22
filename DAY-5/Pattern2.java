import java.util.Scanner;
public class Pattern2
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  sc.close();
  printpattern(n);
 }
   public static void printpattern(int n)
   {
   for(int i=1; i<=n; i++)
   {
     for(int j=n; j>=i; j--)
     {
      System.out.print("* ");
     }
       System.out.println();
     }
   } 
 }

//OUTPUT:
//Sample input:
//8
//Sample output:
//* * * * * * * *
//* * * * * * *
//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*