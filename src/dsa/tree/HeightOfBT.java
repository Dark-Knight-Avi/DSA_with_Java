package dsa.tree;

public class HeightOfBT {
    public static int findHeight(Node root){
        if (root == null ){
            return 0;
        } else if (root.left == null && root.right == null){
            return 1;
        }
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
}
