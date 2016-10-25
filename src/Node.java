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
      System.out.println(n + " is already in the tree.");
    }
  }

  public void delete(int n) {

  }

  public void search(int n) throws NullPointerException {
    if (left.key == n || right.key == n) {
      System.out.println("found " + n);
    } else {
      if (left != null) {
        left.search(n);
      }
      if (right != null) {
        right.search(n);
      }
    }
    System.out.println(n + " not found");
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
