import java.util.PriorityQueue;
import java.util.Queue;

public class DFS_preorder {
  public static void preorder(Node root) {
    if (root.left == null && root.right == null) {
      System.out.println(root.val);
      return;
    }

    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
  }

  public static Node binaryTreeGenerator() {
    Node head = new Node(20);

    head.right = new Node(122);
    head.left = new Node(123);

    head.left.left = new Node(26);
    head.left.right = new Node(72);

    head.right.left = new Node(57);
    head.right.right = new Node(92);

    return head;
  }

  public static void main(String[] args) {
    Node binaryTree = binaryTreeGenerator();
    preorder(binaryTree);
  }
}

class Node implements Comparable {
  int val;
  Node left;
  Node right;

  Node() {
    left = null;
    right = null;
  }

  public Node(int x) {
    val = x;
    left = null;
    right = null;
  }

  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }
}