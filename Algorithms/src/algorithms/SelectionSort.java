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
/* This algorithm  is not  suitable for large data set as its average and worst case
complexities are of  Ο(n2), where n  is the number of items. */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j; //Searching for the lowest index
                    
                }
            }
            int smallNumber = arr[index]; //Soring the values using the smallNumber values 
            arr[index] = arr[i];
            arr[i] = smallNumber;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for(int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        
        //Sorting array using selection sort
        selectionSort(arr1);
        
        System.out.println("After Selection Sort");
        for(int i : arr1){
            System.out.print(i+" "); //To loop through the sorted items
        }
    }
}
