import java.util.*;
import java.io*;
public class Array
{
 public ststic void main(String[] args)
 double avereage = 0
 double sum = 0
 
 {
 Scanner scan = new Scanner(System.in);
 int N = scan.nextInt();
 int marks[] = new int[N];
 for(int i=0; i<marks.length; i++) {
 marks[i] = scan.nextInt();
 sum = sum + marks[i];
 }
 average = sum/N;
 System.out.println("Average
 scan.close()
 }
