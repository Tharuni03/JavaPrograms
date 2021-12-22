import java.util.Scanner;
public class Pattern3
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
	for(int k=n; k>i; k--)
     		{
			System.out.print("  ");
		}
		for(int j=1; j<=i; j++)
		{
			System.out.print("* ");
   		}	
		System.out.println();
      }
   }
}

//OUTPUT:
//Sample input:
//7
//Sample output:
//            *
//          * *
//        * * *
//      * * * *
//    * * * * *
//  * * * * * *
//* * * * * * *


     