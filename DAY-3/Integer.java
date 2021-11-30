import java.util.Scanner;
class Integer
{
public static void main(String[] args)
 {
  int n;
   try { 
     Scanner sc= new Scanner(System.in);
     n= sc.nextInt();
     String s= String.valueOf(n);
     System.out.println("Good job");
     sc.close();
     }
     catch(Exception e)
     {
      System.out.println("Wrong Answer");
     }
   }
}

//OUTPUT:
//13 64
//Good job