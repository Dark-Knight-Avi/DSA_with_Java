package dsa.tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
        Traversal traverse = new Traversal();
        traverse.preOrderTraverse(root);
        System.out.println();
        traverse.inOrderTraverse(root);
        System.out.println();
        traverse.postOrderTraverse(root);
        System.out.println();
        traverse.levelOrderTraversal(root);
    }
}
