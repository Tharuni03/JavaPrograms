import java.util.Scanner;
public class Bubble
{
 public static void bubblesort(int[] arr)
 {
  int n = arr.length;
  int temp = 0;
  for(int i=0; i<n; i++)
  {
   for(int j=1; j<(n-1); j++)
   {
    if(arr[j]>arr[j+1])
    {
     temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
     }
    }
   }
  }
      public static void main(String[] args)
      {
      int arr[] = {3,8,33,12,78,99,2,45,70};
      System.out.println("Array before swapping bubble sort");
      for(int i=0; i<arr.length; i++)
      {
      System.out.print(arr[i]+" ");
      }
      System.out.println();
      bubblesort(arr);
      System.out.println("Array after swapping bubble sort");
      for(int i=0; i<arr.length; i++)
      {
      System.out.print(arr[i]+" ");
      }
     }
    }

//OUTPUT:
//Array before swapping bubble sort
//3 8 33 12 78 99 2 45 70
//Array after swapping bubble sort
//2 3 8 12 33 45 70 78 99