package BinaryTree_Implementation_HT17;

public class BinaryTree {
    public void add(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                add(node.left, value);
            } else {
                System.out.println(" Add " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                add(node.right, value);
            } else {
                System.out.println(" Add " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}
