class Conditional
{
public static void main(String[] args)
{
int n=3;
if(n%2==0)
{
    System.out.println("n is even");
        if(n>=2&&n<=5)
          {
            System.out.println("Not Weird");
          }
         if(n>=6&&n<=20)
          {
             System.out.println("Weird");
           }
          if(n>20)
            {
              System.out.println("Not Weird");
            }
}
else
{
 System.out.println("Weird");
}
}
}

//OUTPUT:
//Weird
