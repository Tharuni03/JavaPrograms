import java.util.*;
public class Code
{
 public static void main(String arg[])
 {
 double temp;
 Scanner scan=new Scanner(System.in);
 int t=scan.nextInt();
 for(int i=0;i<t;i++)
 {
  int a=scan.nextInt();
  int b=scan.nextInt();
  int n=scan.nextInt();
  temp=0.0;
  for(int j=0;j<n;j++)
  {
    temp=temp+(Math.pow(2,j)*b);
    System.out.println(a+(int)temp+" ");
  }
  System.out.println();
 }
 }
}
 
OUTPUT:
2
0 2 10 5 3 5
2
6
14
30
62
126
254
510
1022
2046

8
14
26
50
98 