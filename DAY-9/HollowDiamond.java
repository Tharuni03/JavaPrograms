import java.util.*;
public class HollowDiamond
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=rows-i;j++)
     {
      System.out.print(" ");
     }
    for(int k=1;k<=i*2-1;k++)
    {
     if(k==1 || k==i*2-1)
     { 
     System.out.print("*");
     }
     else
     {
     System.out.print(" ");
     }
    }
   System.out.println();
   }
   for(int i=rows-1;i>0;i--)
   {
    for(int j=1;j<=rows-i;j++)
     {
      System.out.print(" ");
     }
    for(int k=1;k<=i*2-1;k++)
    {
     if(k==1 || k==i*2-1)
     {
     System.out.print("*");
     }
     else
     {
     System.out.print(" ");
     }
    }
   System.out.println();
  }
 }
}

//OUTPUT:
//Sample input
//5
//Sample output
//    *
//   * *
//  *   *
// *     *
//*       *
// *     *
//  *   *
//   * *
//    *