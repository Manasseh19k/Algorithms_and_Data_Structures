/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;


// Java program to demonstrate working of Collections. 
// binarySearch() 
import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections;
/**
 *
 * @author Manasseh
 */
public class Collections_Binary_Search {
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(10); 
        al.add(20); 
   
        // 10 is present at index 3. 
        int key = 10; 
        int res = Collections.binarySearch(al, key); 
        if (res >= 0) 
            System.out.println(key + " found at index = " 
                                                 + res); 
        else
            System.out.println(key + " Not found"); 
  
        key = 15; 
        res = Collections.binarySearch(al, key); 
        if (res >= 0) 
            System.out.println(key + " found at index = "
                                                  + res); 
        else
            System.out.println(key + " Not found"); 
    } 
}
