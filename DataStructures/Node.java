package DataStructures;

public class Node {
  private String value;
  private int key;
  private Node next;

  // Default Consutructor
  public Node() {
    this.key = 0;
    this.value = null;
    this.next = null;
  }

  public Node(String v, int k) {
    this.key = k;
    this.value = v;
    this.next = null;
  }

  public void setValue(String v) {
    this.value = v;
  }

  public void setKey(int k) {
    this.key = k;
  }

  public void setNext(Node n) {
    this.next = n;
  }

  public String getValue() {
    return this.value;
  }

  public int getKey() {
    return this.key;
  }

  public Node getNext() {
    return this.next;
  }
}