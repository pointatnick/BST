public class Node {
  private Node left;
  private Node right;
  private int key;

  public Node(int n) {
    left = null;
    right = null;
    key = n;
  }

  public void insert(int n) {
    if (n < key) {
      if (left == null) {
        left = new Node(n);
      } else {
        left.insert(n);
      }
    } else if (n > key){
      if (right == null) {
        right = new Node(n);
      } else {
        right.insert(n);
      }
    } else {
      System.out.println("Error: " + n + " is already in the tree.");
    }
  }

  public void delete(int n) {

  }

  public boolean search(int n) throws NullPointerException {
    boolean isInTree = false;
    if (n == key) {
      isInTree = true;
    } else if (n < key) {
      if (left != null) {
        isInTree = left.search(n);
      }
    } else if (n > key) {
      if (right != null) {
        isInTree = right.search(n);
      }
    }
    return isInTree;
  }

  public void traverse() {
    if (left != null) {
      left.traverse();
    }
    System.out.println(key);
    if (right != null) {
      right.traverse();
    }
  }

}
