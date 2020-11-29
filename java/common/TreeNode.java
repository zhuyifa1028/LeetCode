package common;

/**
 * 树节点
 *
 * @author zhuyifa
 * @version 2020-11-27
 */
public class TreeNode {

    /**
     * 值
     */
    public Integer val;
    /**
     * 左节点
     */
    public TreeNode left;
    /**
     * 右节点
     */
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 获取树的深度
     *
     * @return 树的深度
     */
    public int getDepth() {
        return getDepth(this);
    }

    /**
     * 获取树的深度
     *
     * @param root 根节点
     * @return 树的深度
     */
    private int getDepth(TreeNode root) {
        return root == null ? 0 : Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }

}
