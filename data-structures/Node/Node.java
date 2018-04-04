/**
 * @author Ata Gowani
 * @see README.md
 * A simple class definition of a Node.
 */

public class Node {
  private String value;
  private int key;

  Node() { // Default Consutructor
    this.key = null;
    this.value = null;
  }

  Node(String v, int k) {
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