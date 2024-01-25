/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * Insertion  sort  is a simple sorting  algorithm  that  works the way  we sort  playing
cards in  our hands.
 * @author Manasseh
 */
class InsertionSort 
{
    /* Fu n ct ion  t o sort  array  u sin g  in sert ion  sort */
    void sort(int arr[])
    {
        int n = arr.length;
        for(int i = 1; i < n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            
            /*  Move elements of  arr[0..i -1], that  are greater than  key , to one position  ahead
                of  their current  position  */
            
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
