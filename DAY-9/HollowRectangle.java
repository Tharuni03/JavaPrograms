import java.util.*;
public class HollowRectangle
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int rows=sc.nextInt();
  int columns=sc.nextInt();
  for(int i=1;i<=rows;i++)
  {
   for(int j=1;j<=columns;j++)
    {
     if(i==1 || i==rows || j==1 || j==columns)
     System.out.print("*");
     else
     System.out.print(" ");
    }
  System.out.println();
  }
}
}

//OUTPUT:
//Sample input
//5 10
//Sample output
//**********
//*        *
//*        *
//*        *
//**********