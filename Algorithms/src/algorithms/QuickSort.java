/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Manasseh
 */
class QuickSort 
{
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller elements
        
        for(int j = low; j <= high - 1; j++)
        {
            // if the element is smaller or equal to pivot
            if(arr[j] <= pivot)
            {
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    //the main function that implements QuickSort
    //arr[] --> Array to be sorted,
    //low --> Starting index,
    // high --> Ending index
    
    void sort(int arr[], int low, int high)
    {
        if(low < high)
        {
            //pi is partitioning index, arr[pi] is at the right place
            int pi = partition(arr, low, high);
            
            //Recurvisely sort elements before partition
            // and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    //A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
