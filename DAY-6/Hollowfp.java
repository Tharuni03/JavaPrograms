import java.util.*;
public class Hollowfp
{
    public static void printpattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int k=i; k<n; k++)
               System.out.print(" ");
            for(int j=1; j<=i;j++)
            {
                if(i!=n)
                {
                    if(j!=1 && j!=i)
                         System.out.print("  ");
                   else 
                         System.out.print(j+" ");

                }
                else 
                         System.out.print(j+" ");
            } 
                        System.out.println();     

        }
    }
       public static void main(String arg[])
       {
           Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
           scan.close();
           printpattern(n);

       }
    }       

//OUTPUT:
//Sample input
//5
//Sample output
//    1 
//   1 2
//  1   3
// 1     4
//1 2 3 4 5
