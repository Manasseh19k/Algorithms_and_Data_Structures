/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manasseh
 * The time complexity for the Merge Sort algorithm is O(n log n).

The time complexity for the program code remains the same in all cases, i.e., worst case or best case.
 */
public class MergeSort { //Divide and Conquer nickname
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size_of_array = scanner.nextInt(); //size of the array, to be entered by the user
        int arr[] = new int[size_of_array];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size_of_array; i++)
            arr[i] = scanner.nextInt(); //the elements of the array
        arr = Merge_Sort(arr, size_of_array);
        System.out.println("Array after Merge Sort is: ");
        for(int i = 0; i < size_of_array; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }
    static int[] Merge_Sort(int arr[], int size){
        if(size > 1){
            int mid = size/2;
            int[] first = Arrays.copyOfRange(arr, 0, mid);
            first = Merge_Sort(first, mid); //recursive call for first half array
            int[] second = Arrays.copyOfRange(arr, mid, size);
            second = Merge_Sort(second, size - mid);
            arr = Merge_arrays(first, second, mid, size - mid);
        }
        return arr;
    }
    static int[] Merge_arrays(int first[], int second[], int n, int m) //respectively
    {
        int arr[] = new int[n + m];
        int i = 0, f = 0, s = 0;
        while(f < n && s < m){
            if(first[f] < second[s])
                arr[i++] = first[f++];
            else
                arr[i++] = second[s++];
        }
        while(f < n)
            arr[i++] = first[f++];
        while(s < m)
            arr[i++] = second[s++];
        return arr;
    }
}
