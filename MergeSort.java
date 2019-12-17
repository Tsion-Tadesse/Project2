/*
 * Tsion Tadesse
 * COSC 311 FALL 2019
 * Project 2 December 10, 2019
 * URL: 
 */
import java.util.Random;
import java.util.Scanner;
class MergeSort 
{ 
	static int count = 0;
    void merge(int arr[], int left, int  mid, int right) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = mid - left + 1; 
        int n2 = right -  mid; 
       
       
        // Create temp arrays 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //Copy data to temporary arrays
        for (int i=0; i<n1; ++i) {
            L[i] = arr[left + i];
            //count+=1;
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr[ mid + 1+ j];
            //count+=1;
        }
        	
        // Merge the temporary arrays 
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
        
        // Initial index of merged subarry array 
        int k = left; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
                           
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
                
            } 
            k++; 
            
        } 
       
        
        // Copy remaining elements of L[] if any 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
            //count+=1;
        } 
        // Copy remaining elements of R[] if any 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
            //count+=1;
        } 
        int mergeSort =0;
        int arrSize = right - left + 1;
        int timeIttakes = 2*(2*(arrSize/2));
        int timeToExcute = (int) Math.pow((timeIttakes- arrSize), 2);
    	   mergeSort += 1/count *(timeToExcute);
        
    } 
   
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            // Find the middle point 
            int mid = (left+right)/2; 
            count+=1;
            // Sort first and second halves 
            sort(arr, left, mid); 
            count+=1;
            sort(arr , mid+1, right);  
            count+=1;
            // Merge the sorted halves 
            merge(arr, left, mid, right);    
            count+=1;
        }     
       
    } 
    // A utility function to print array of size n 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
        
    }
    
    public static void main(String args[]) 
    { 
    	Scanner in = new Scanner(System.in);
    	//random numbers generator is used here to get points for the data
    	System.out.print("Enter the number of items you would like to compute: ");
    	int num = in.nextInt();
    	Random r = new Random();
    	int arr [] = new int[num]; // here our data size (x) is num
    	for(int i=0; i<num; i++) { 
        arr[i]= r.nextInt(20);
    	}
    	
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
        System.out.println("n or number of measurement taken: " + count); 
        // the number of orders in which the steps are take
       
    } 
} 
// Src: Geeks of Geeks