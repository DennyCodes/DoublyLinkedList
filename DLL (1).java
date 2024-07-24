public class DLL<T> implements List<T> {
  
  public class Node<T> {
    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;
    
    public Node(T data) {
      this.data = data;
    }
    
    public Node() {
      this.data = null;
    }
  }
  private Node<T> headNode;
  private Node<T> tailNode;
  private int length;
  
  public DLL() {
    this.headNode = new Node<T>();
    this.tailNode = new Node<T>();
    headNode.nextNode = tailNode;
    tailNode.prevNode = headNode;
  }
  
  public int getLength() {
    return this.length;
  }  
    
  public boolean isEmpty() {
    if (this.getLength() == 0) {
      return true;
    }
    return false;
  }
  
  
  public void insertFront(T t) {
    Node<T> newNode = new Node<T>(t);
    Node<T> oldFront = headNode.nextNode;
    this.headNode.nextNode = newNode;
    newNode.nextNode = oldFront;
    oldFront.prevNode = newNode;
    newNode.prevNode = headNode;
    length+=1; 
    
  }
  
  
  public void insertBack(T t) {
    Node<T> newNode = new Node<T>(t);
    Node<T> cur = this.headNode;
    while (cur.nextNode != null) {
      cur = cur.nextNode; 
    }
    cur.nextNode = newNode;
    newNode.prevNode = cur;
    length+=1;
  }
  
  public void removeFront() {
    Node<T> remove = this.headNode.nextNode;
    Node<T> preserve;
    
    if (remove != null) {
      preserve = remove.nextNode; 
      headNode.nextNode = preserve;
      preserve.prevNode = headNode;
    }
    length-=1; 
    
  }
  
   public void remove(T element) {

      Node<T> current = headNode.nextNode;
      while (current != null) {
      if (current.data.equals(element)) {

          Node<T> prevNode = current.prevNode;
          Node<T> nextNode = current.nextNode;
      
          if (prevNode != null) {
              prevNode.nextNode = nextNode;
          } else {
              
              headNode.nextNode = nextNode;
          }
      
          if (nextNode != null) {
              nextNode.prevNode = prevNode;
          }
      
     
          current.prevNode = null;
          current.nextNode = null;
      
        
          length--;
      
          return; 
         }
      
      current = current.nextNode;
      }
   }
    // if (currentNode == null) {
    //   System.out.println("Data " + t + " not found in the list.");
    //   return;
    // }
    
    // // currentNode.prevNode = null;
    // // currentNode.nextNode = null;
    // return;
    // // currentNode.prevNode = currentNode.nextNode;
    // // currentNode.nextNode = currentNode.prevNode; 
    
    
    
  
  
  public void removeBack() {
    Node<T> oldBack = tailNode.prevNode;
    Node <T> preserve = oldBack.prevNode; 
    
    
    if (this.getLength() != 0) {
      preserve.nextNode = null;
      
      tailNode.prevNode = preserve;
      preserve.nextNode = tailNode;
    }
    length-=1;
    
    
  }
  
  
  public T get(int index) {
    Node<T> counter = headNode;
    for (int i =0; i<index; i++ ) {
      counter = counter.nextNode;
    }
    
    return counter.data; 
  }
  
  
  public boolean clearAll() {
    if (headNode.nextNode == tailNode ) {
      return true;
    }
    this.removeBack();
    return this.clearAll();
  }
  
  public String toString () {
    String s = " "; 
    Node<T> n = headNode.nextNode;
    
    for (int i = 0; i<this.getLength();i++) {
      s+= n.data;
      s+= ", ";
      n = n.nextNode;
    }
    return s;
  }
    
  }
  //TODO: type all your code here!
  //NOTE: this class won't compile until you override all the methods in the interface
  
  
  
  

