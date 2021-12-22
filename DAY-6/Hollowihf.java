import java.util.Scanner;
public class Hollowihf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printpattern(n);
    }
    public static void printpattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                if (i!=1)
                {
                    if(j!=n && j!=i)
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
}

//OUTPUT:
//Sample imput
//5
//Sample output
//1 2 3 4 5 
//2     5
//3   5
//4 5
//5