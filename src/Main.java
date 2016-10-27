public class Main {

  public static void main(String[] args) {
    // new tree
    Node root = new Node(5);
    root.insert(9);
    root.insert(4);
    root.insert(1);
    root.insert(7);
    root.insert(2);
    root.insert(8);
    root.insert(3);
    root.insert(0);
    root.insert(6);

    // tests
    root.traverse(); // should print out 0-9 in order
    if (root.search(3)) {
      System.out.println("3 is in tree");
    }
    if (!root.search(10)) {
      System.out.println("10 is not in tree");
    }
    root.search(10); // should print error msg
    root.insert(7); // should print error msg
  }
}
