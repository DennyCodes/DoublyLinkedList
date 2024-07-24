// import java.util.*;
// import java.io.*;

class Main {
  public static void main(String[] args) {
    //TODO: test the LinkedList here!
    // LinkedList<String> ll = new LinkedList<>();
    
    // ll.insertFront("ee");
    // ll.insertFront("Hello");
    // ll.insertFront("World");
    // ll.insertFront("Hola");
    // ll.insertBack("First");
    // System.out.println(ll);
    // System.out.println(ll.indexOf("First"));
    
    
    DLL<Integer> dll = new DLL<>();
    
    dll.insertFront(12);
    dll.insertFront(16);
    dll.insertFront(11);
    dll.insertFront(20);
    dll.insertFront(21);
    //dll.insertBack(21);
    System.out.println(dll);
    dll.remove(11);
    System.out.println(dll);
    
    
  }

    ///////////////////////////
    // LINKED LISTS
    //////////////////////////

    // LinkedList-1: What is a singly-linked list? Compared to an ArrayList, what advantages and disadvantages does it have?
    //removing o of 1 vs inserting is iterate o of n 

    // LinkedList-2: Without looking at any previous code, complete the Node inner class that has been provided in the starter code. When you’re finished, compare it to what you wrote previously.

    // LinkedList-3: Let's extend our LinkedList class. Write an indexOf() method that takes in an item and returns the index of the item in the list. Return -1 if the item doesn't exist in the list. 

    //LinkedList-3: Create a LinkedList that contains at least 5 different strings. Test your method by looking up strings that do and don't exist in the list!

    // LinkedList-4: What is a doubly linked list? Compared to a singly linked-list, what advantages and disadvantages does it have?

    // LinkedList-5: Modify the Node inner class so that it could be used in a doubly linked list. When you’re finished, compare it to what you wrote previously. 
    
    // LinkedList-6: Let's extend our DoublyLinkedList class. Write a remove() method that takes in an item and removes it from the doubly-linked list. Return true if an item is removed, and false if the item isn't in the list. 

    // LinkedList-6: Create a DoublyLinkedList of integers from 0-10. Test your method by printing the list and the length of the list before and after the deletion. 
}