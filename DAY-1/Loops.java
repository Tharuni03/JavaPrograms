import java.util.Scanner;
class Loops
{
public static void main(String[]args)
{
int result;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int n=scan.nextInt();
int i=1;
while(i<11)
{
result=n*i;
System.out.println(""+n+"*"+i+"="+result);
i=i+1;
}
}
}

OUTPUT:
Enter a number
2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
