import java.util.Scanner;
class Stdinout
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter an Integer");
int i=scan.nextInt();
System.out.println("Enter a Double");
double d=scan.nextDouble();
System.out.println("Enter a String");
scan.nextLine();
String s=scan.nextLine();
System.out.println("String:" +s);
System.out.println("Double:" +d);
System.out.println("Int:" +i);
}
}

//OUTPUT:
//Enter an Integer
//10
//Enter a Double
//3.333
//Enter a String
//java
//String:java
//Double:3.333
//Int:10