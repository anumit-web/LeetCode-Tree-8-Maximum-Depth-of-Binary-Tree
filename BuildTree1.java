public class BuildTree1 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(3);        

        TreeNode right1 = new TreeNode(20);        
        right1.left = new TreeNode(15);
        right1.right = new TreeNode(7);

        root.left = new TreeNode(9);
        root.right = right1;


        return root;

    }
}