public class Node {
    private Node left;
    private Node right;
    private int val;

    public Node(int val) {
        left = null;
        right = null;
        this.val = val;
    }

    public void insert(int val) {
        if (val < this.val) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }

    public void delete() {

    }
}
