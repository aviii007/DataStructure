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
        System.out.println("Welcome to the Linked list program");
        System.out.println(" ");
        LinkedList list = new LinkedList(); //object for LinkedList class and initialised list with LinkedList


        list.addFirst("is"); //added is and null
        list.printList();
        System.out.println("--------------");

        list.addFirst("name"); //due to addFirst before is comes name
        list.printList();
        System.out.println("---------------");

        list.addLast("ashvini"); //added ashvini at last
        list.printList();
        System.out.println("-----------------");

        list.addFirst("my"); //added my at starting
        list.printList();
        System.out.println("-----------------");

        list.deleteFirst();
        list.printList();
        System.out.println("-----------------");

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        System.out.println("----------------");

        list.addFirst("my");
        list.printList();
        System.out.println(list.getSize());

    }
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
    //delete-last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--; //do size-- when deleting the node

        if (head.next == null) {  //case in which linkedlist have only one node
            head = null;
            return;
        }

        Node secondLast = head;    //make second last node's next as null to delete the last
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    public int getSize(){  //function to return the size

        return  size;
    }
}




