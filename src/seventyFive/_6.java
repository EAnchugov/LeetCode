package seventyFive;

public class _6 {
    public static void main(String[] args) {
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null){
            invertTree(root.right);
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
