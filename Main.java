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

    for (int i = 0; i < 3; i++) {
      String s = "Item " + i;
      Node a =  new Node(s, i);
      if (l.remove(a)) {
        System.out.println("Node with key " + a.getKey() + " deleted successfully!");
      }
    }

    l.print();
    /** **/

    /** Stack Data Structure **/
    Stack k = new Stack(10);
    for (int i = 0; i < 15; i++) 
      k.push(i);
    
    for (int i = 0; i < 15; i++)
      System.out.print(k.pop() + " ");
    
    System.out.print("\n");
    /** **/

    /** Queue Data Structure **/
    Queue q = new Queue(5);
    for (int i = 0; i < 5; i++)
      q.insert(i);
    
    System.out.print("Queue containes: ");
    for (int i = 0; i < 5; i++)
      System.out.print(q.remove() + " ");
    System.out.print("\n");
    /** **/

    /** Min Heap Data Struture **/
    // MinHeap heap = new MinHeap(10);
    // heap.insert(10);
    // heap.insert(5);
    // heap.insert(9);
    // heap.insert(1);
    // heap.print();
    /** **/
  }
}