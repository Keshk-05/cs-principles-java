public class LinkedList<T> {
  private Node<T> listItem = new Node<T>;
  private Node head;
  private Node tail;

  LinkedList() {
    this.listItem.data = 0;
    this.listItem.next = null;
  }

  LinkedList (T data) {
    this.listItem.data = data;
    this.listItem.next = null;
  }

  // Adds item to the end of the linked list
  public void addNode() {

  }




}

class Node<T> {
  protected T data;
  protected Node next;
}