import java.util.*; 

public class Day8_1 {  
    public static void main(String[] args) {  

  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
int sum =0;
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]); 
sum=sum+array[i];
}  
      System.out.println("Sum of all the numbers are "+sum);
Double k = (double)sum/n ;
      System.out.println("Average of all the numbers is : "+ k);
        int max = array[0];  
        //Loop through the array  
        for (int i = 0; i < array.length; i++) {  
            //Compare elements of array with max  
           if(array[i] > max)  
               max = array[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
          int min = array[0];
          for (int i = 0; i < array.length; i++) {  
            //Compare elements of array with max  
           if(array[i] < min)  
               min = array[i];  
        }  
         System.out.println("Smallest element present in given array: " + min);  
          Arrays.sort(array);
 
        System.out.println();
 
        // Displaying elements of array after sorting
        System.out.println(
            "Elements of array sorted in ascending order : "
            + Arrays.toString(array));
    }
    }  
 