import DataStructures.*;

public class Main {
  public static void main(String args[]) {
    /** Node Data Structure **/
    Node n = new Node();
    n.setValue("Ata Gowani");
    n.setKey(0);

    System.out.println("Node value: " + n.getValue());
    System.out.println("Node key: " + n.getKey());
    /** **/

    /** LinkedList Data Structure **/
    LinkedList l = new LinkedList();
    for (int i = 0; i < 10; i++) {
      String s = "Item " + i;
      Node a;
      if (i == 5)
        a = new Node(s, 1);
      else
        a = new Node(s, i);
      if (l.add(a)) {
        System.out.println("Node with key " + a.getKey() + " added successfully!");
      } else {
        System.out.println("Unable to add node with key " + a.getKey());
      }
    }

    l.print();
    /** **/
  }
}