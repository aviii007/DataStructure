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
        System.out.println(" ");
        LinkedList list = new LinkedList(); //object for LinkedList class and initialised list with LinkedList


        list.addFirst("is"); //added is and null
        list.printList();
        System.out.println("--------------");

        list.addFirst("name"); //due to addFirst before is comes name
        list.printList();
        System.out.println("---------------");

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
}




