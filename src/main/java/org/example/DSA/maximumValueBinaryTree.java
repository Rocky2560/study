package org.example.DSA;

public class maximumValueBinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private  TreeNode right;
        private int data;

        public TreeNode (int data)
        {
            this.data = data;
        }

    }

    public void createBinaryTree()
    {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(22);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        root = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
    }

    public int maxBinaryTree(TreeNode root)
    {
        if (root == null)
        {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = maxBinaryTree(root.left);
        int right = maxBinaryTree(root.right);

        if (left > result)
            result = left;

        if (right > result)
            result = right;

        return result;

    }

    public static void main(String[] args) {

        maximumValueBinaryTree maximumValueBinaryTree = new maximumValueBinaryTree();
        maximumValueBinaryTree.createBinaryTree();
        System.out.println(maximumValueBinaryTree.maxBinaryTree(maximumValueBinaryTree.root));


    }
}
