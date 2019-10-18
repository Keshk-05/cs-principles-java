public class DFS_postorder {
  public static void main(String[] args) {
    Node binaryTree = new Node(50);
    Node curr = binaryTree;

    curr.left = new Node(21);
    curr.right = new Node(30);

    curr = curr.left;

    curr.left = new Node(80);

    curr = binaryTree.right;

    curr.left = new Node(40);

    curr = curr.left;

    curr.right = new Node(60);

    postorder(binaryTree);
  }

  public static void postorder(Node head) {
    if (head.left == null && head.right == null) {
      System.out.println(head.val);
      return;
    }
    if (head.left != null) postorder(head.left);
    if (head.right != null) postorder(head.right);
    System.out.println(head.val);
  }
}

class Node {
  int val;
  Node right = null;
  Node left = null;

  Node() {
    this(0);
  }

  Node(int x) {
    this.val = x;
  }
}