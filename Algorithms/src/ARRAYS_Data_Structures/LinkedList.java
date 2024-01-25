/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS_Data_Structures;

/**
 *
 * @author Manasseh
 */
class LinkedList 
{
    Node head; //head of list
    
    //Linked list Node
    class Node{
    int data;
    Node next;
    Node(int d) {data = d; next = null;}
    }
    
    //function to insert a new_node in a list
    void sortedInsert(Node new_node){
        Node current;
        
        //Special case for head node
        if(head == null || head.data >= new_node.data)
        {
            new_node.next = head;
            head = new_node;
        }else{
            //Locate the node before point of insertion
            current = head;
            
            while(current.next != null && current.next.data < new_node.data)
                current = current.next;
            
            new_node.next = current.next;
            current.next = new_node;
        }
    }
    //Utility functions
    //Function to create a node
    Node newNode(int data){
        Node x = new Node(data);
        return x;
    }
    //Function to print Linked List
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //Drier function to test above methods
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        Node new_node;
        new_node = lList.newNode(5);
        lList.sortedInsert(new_node);
        new_node = lList.newNode(10);
        lList.sortedInsert(new_node);
        new_node = lList.newNode(7);
        lList.sortedInsert(new_node);
        new_node = lList.newNode(3);
        lList.sortedInsert(new_node);
        new_node = lList.newNode(1);
        lList.sortedInsert(new_node);
        new_node = lList.newNode(9);
        lList.sortedInsert(new_node);
        System.out.println("Created Linked List");
        lList.printList();
    }
}
