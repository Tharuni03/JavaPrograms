import java.util.*;
public class Pattern
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i=0, j=0;
  int k = n;
  for(i=n; i>0; i--)
  {
   String s = "";
   for(j=i; j>0; j--)
   {
   System.out.print(s + j);
   s = " ";
   }
   System.out.println();
  }
  for(i=2; i<=n; i++)
  {
    String s = "";
    for(j=1; j>0; j--)
    {
    System.out.print(s+j);
    s = " ";
    } 
    System.out.println();
   }
  }
 }
