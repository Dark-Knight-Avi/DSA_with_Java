package dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void preOrderTraverse(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    public static void inOrderTraverse(Node root){
        if (root == null){
            return;
        }
        inOrderTraverse(root.left);
        System.out.print(root.data + " ");
        inOrderTraverse(root.right);
    }
    public static void postOrderTraverse(Node root){
        if (root == null){
            return;
        }
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curNode = q.remove();
            if (curNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null){
                    q.add(curNode.left);
                }
                if (curNode.right != null){
                    q.add(curNode.right);
                }
            }
        }
    }
}