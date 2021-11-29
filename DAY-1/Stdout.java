import java.util.Scanner;
public class Stdout
{
public static void main(String[] args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println("=======================");
  for(int i=0;i<3;i++)
  {
  String s1=scan.next();
  int x=scan.nextInt();
  System.out.println(""+s1+"                 "+x+"");
  }
  System.out.println("======================");
 }
}

OUTPUT:
=======================
java 100 cpp 065 python 050
java                 100
cpp                 65
python                 50
======================
