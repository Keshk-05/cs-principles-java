public class DFS_inorder {
  public static void main (String[] args) {
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

    inorder(binaryTree);
  }

  public static void inorder(Node head) {
    if (head.left == null && head.right == null) {
      System.out.println(head.val);
      return;
    }
    if (head.left != null) inorder(head.left);
    System.out.println(head.val);
    if (head.right != null) inorder(head.right);
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