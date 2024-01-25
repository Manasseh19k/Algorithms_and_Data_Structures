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
class BinarySearch 
{ 
    // Returns index of y if it is present in arr[l..
    // r], else return -1 
    int binarySearch(int[] arr, int l, int r, int y)
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
   
            // If the element is present at the  
            // middle itself 
            if (arr[mid] == y)
               return mid; 
   
            // If element is smaller than mid, then  
            // it can only be present in left sub-array
            if (arr[mid] > y)
               return binarySearch(arr, l, mid-1, y);
   
            // Else the element can only be present 
            // in right sub-array
            return binarySearch(arr, mid+1, r, y);
        } 
   
        // We reach here when element is not present 
        //  in array 
        return -1; 
    } 
   
    // Driver method to test above 
    public static void main(String[] args)
    { 
        BinarySearch ob = new BinarySearch(); 
        int[] arr = {2,3,4,10,40};
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr,0,n-1,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  result); 
    } 
} 