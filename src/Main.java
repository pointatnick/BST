public class Main {

  public static void main(String[] args) {
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
    root.traverse(); // should print out 0-9 in order
  }
}
