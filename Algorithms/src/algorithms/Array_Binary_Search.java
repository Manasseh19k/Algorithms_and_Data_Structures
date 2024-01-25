/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
/**
 *
 * @author Manasseh
 */
public class Array_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        Arrays.sort(arr);
        
        int key = 22;
        int result = Arrays.binarySearch(arr, key);
        if(result >= 0)
            System.out.println(key + " found at index = " + result);
        
        else
            System.out.println(key + " Not found");
        
        key = 40;
        result = Arrays.binarySearch(arr, key);
        if(result >= 0)
            System.out.println(key + " found at index = " + result);
        else
            System.out.println(key + " Not found");
    }
}
