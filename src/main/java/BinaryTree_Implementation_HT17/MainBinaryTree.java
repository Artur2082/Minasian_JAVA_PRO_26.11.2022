package BinaryTree_Implementation_HT17;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(6);
        System.out.println(" Binary tree with root = " + root.value);
        tree.add(root, 3);
        tree.add(root, 11);
        tree.add(root, 9);
        tree.add(root, 4);
        tree.add(root, 15);
        tree.add(root, 1);
        System.out.println("Traversing tree in order :");
        tree.traverseInOrder(root);
    }
}
