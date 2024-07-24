/*
List Interface:
This interface is to be used to create the linked list!
Not to be confused with the java.util.List interface.
This is a simplified version to be used with this project.
*/


//struct Node {
//   int data;
//   srucrt Node* next;
  
// };

//struct Node {
//   int data;
//   struct Node next;
//   struct Node prev;
  
// };
//data in the middle
// prev reference
// next refenence 


public interface List<T>  {

  //returns the length of the list
  public int getLength();

  //returns true if the is empty
  public boolean isEmpty();

  //inserts a new node at the front
  public void insertFront(T t);

  //inserts a new node at the back
  public void insertBack(T t);
  
  //removes the first node
  public void removeFront();

  //removes the last node
  public void removeBack();
  
  public void remove(T t);
  
  // 

  //returns the data (of type "T") at the given index. Throws an IndexOutofBounds exception if the given index isn't in the list
  public T get(int index);

  //deletes everything in the list
  public boolean clearAll();
}
