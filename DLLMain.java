class Main {
  public static void main(String[] args) {
    //TODO: test the DoublyLinkedList here!
    DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
    
    ll.insertFront(12);
    ll.insertFront(16);
    ll.insertFront(11);
    ll.insertFront(20);
    ll.insertBack(21);
    System.out.println(ll);
    
    System.out.println(ll.getLength());
    
    System.out.println(ll.isEmpty());
    
    ll.removeFront();
    
    ll.removeBack();
    
    System.out.println(ll);
    
    System.out.println(ll.getLength());
    
    System.out.println(ll.get(1));
    
    System.out.println(ll.clearAll());
        
    System.out.println(ll);
     
  }
}