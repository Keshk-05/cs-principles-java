package DataStructures;

public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public LinkedList (Node n) {
    this.head = n;
  }

  public boolean find(Node n) {
    Node curNode = this.head;
    boolean present = false;

    while (curNode != null) {
      if (curNode.getKey() == n.getKey())
        present = true;
      curNode = curNode.getNext();
    }

    return present;
  }

  public boolean add(Node n) {
    if (this.head == null)
      this.head = n;
    else {
      Node curNode = this.head;

      while (curNode.getNext() != null) {
        if (curNode.getKey() == n.getKey())
          return false;
        curNode = curNode.getNext();
      }
      curNode.setNext(n);
    }
    return true;
  }

  public boolean remove(Node n) {
    if (this.head != null) {
      Node currNode = this.head;

      if (currNode.getKey() == n.getKey()) {
        this.head = currNode.getNext();
        return true;
      }

      while (currNode.getNext() != null) {
        if (currNode.getNext().getKey() == n.getKey()) {
          currNode.setNext(currNode.getNext().getNext());
          return true;
        }
        currNode = currNode.getNext();
      }
    }

    return false;
  }

  public void print() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println("==");
      System.out.print("Value: " + curNode.getValue());
      System.out.print("|");
      System.out.println("Key: " + curNode.getKey());
      System.out.println("==");
      curNode = curNode.getNext();
    }
  }
}