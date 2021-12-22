import java.util.Scanner;
public class Invertedhf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        printpattern(rows);
    }
    public static void printpattern(int rows) {
        for(int i=rows; i>=1; --i) {
            for(int j=1; j<=i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//OUTPUT:
//Sample input
//7
//Sample output
//1 2 3 4 5 6 7 
//1 2 3 4 5 6 
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1