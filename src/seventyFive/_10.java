package seventyFive;

public class _10 {
    public static void main(String[] args) {


    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.left !=null && root.left != p && root.left != ){
            lowestCommonAncestor(root, p, q);
            return null;
        }
        if (root.right != null && root.left != p) {
            lowestCommonAncestor(root, p, q);
            return null;
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
