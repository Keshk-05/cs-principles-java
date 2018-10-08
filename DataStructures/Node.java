package DataStructures;

public class Node {
  private String value;
  private int key;

  // Default Consutructor
  public Node() {
    this.key = 0;
    this.value = null;
  }

  public Node(String v, int k) {
    this.key = k;
    this.value = v;
  }

  public void setValue(String v) {
    this.value = v;
  }

  public void setKey(int k) {
    this.key = k;
  }

  public String getValue() {
    return this.value;
  }

  public int getKey() {
    return this.key;
  }
}