public class Insertionsort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {12,66,89,56,4,56,34,98,32,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); 
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}

//OUTPUT:
//Before Insertion Sort
//12 66 89 56 4 56 34 98 32 22
//After Insertion Sort
//4 12 22 32 34 56 56 66 89 98   