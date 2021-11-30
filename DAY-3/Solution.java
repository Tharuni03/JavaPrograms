import java.util.*;
import java.io.*;

  class Solution{
       public static void main(String[] arg)
       {
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          for(int i=0;i<t;i++)
          {
            try
            {
               long x=sc.nextLong();{
               System.out.println(x+" can be fitted in:");
               if(x>=-128&&x<=127)System.out.println("*byte");
               if(x>=-32768&&x<=32768)
               System.out.println("*Short");
               if(x>=-2147483648&&x<=2147483647)
               System.out.println("*Integer");
               }
               System.out.println("*Long");  
               }
               catch(Exception e)
               {
                  System.out.println(sc.next()+"cant be fitted anywhere.");
               } 
             }
            } 
         }

//OUTPUT:
//5
//5 can be fitted in:
//*byte
//*Short
//*Integer
//*Long
//67890876
//67890876 can be fitted in:
//*Integer
//*Long
//76549876509
//76549876509 can be fitted in:
//*Long
//123456789
//123456789 can be fitted in:
//*Integer
//*Long
