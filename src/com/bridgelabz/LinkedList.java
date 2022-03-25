package com.bridgelabz;

public class LinkedList {
    Node head; //creating the head node
    public int size;

    //constructor of class
    LinkedList(){
        this.size = 0;  //initializing the size as zero
    }
    //Node class
    public class Node{
        String data;
        Node next;

        //Constructor
        Node(String data){
            this.data = data;
            this.next = null; //for every new node its next will be null by default
            size++;  //do size++ when creating the new node
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Linked list program");

    }

    //add-first
    public void addFirst(String data) {  //function is addFirst and String Data is parameter
        Node newNode = new Node(data);  //creating node
        if (head == null) {
            head = newNode; //assign new node value to head
            return;
        }

        newNode.next = head; //new node will point head
        head = newNode; //head value will become new node

    }
    //add-last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){ //travel untill current node's next become null
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }
    //print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data  + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //delete-first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--; //do size-- when deleting the node
        head = head.next;  //if we need to delete first then make first's next its head
    }
}




