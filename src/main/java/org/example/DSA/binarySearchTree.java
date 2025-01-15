package org.example.DSA;

public class binarySearchTree {

    private TreeNode root;

    private class TreeNode
    {
        private TreeNode left;
        private TreeNode rigth;
        private int data;

        public TreeNode(int data)
        {
            this.data = data;
        }
    }

    public void insert (int value)
    {
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value)
    {
        if (root == null)
        {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data)
        {
            root.left = insert(root.left, value);
        }

        if (value > root.data)
        {
            root.rigth = insert(root.rigth, value);
        }

        return root;
    }

    public void inOrder()
    {
         inOrder(root);
    }
    public void inOrder(TreeNode root)
    {
        if (root == null)
        {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.rigth);
    }

    public TreeNode search(int key)
    {
        return searchBinarytree(root, key);
    }

    //Searching key in binaryTree
    public TreeNode searchBinarytree(TreeNode root, int key)
    {
        if (root == null || root.data == key)
        {
            return root;
        }
        if (key < root.data)
        {
            return searchBinarytree(root.left, key);
        }
        else
        {
            return searchBinarytree(root.rigth, key);
        }

    }

    public static void main(String[] args) {
        binarySearchTree binarySearchTree = new binarySearchTree();

        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(122);
//        binarySearchTree.inOrder();
        if (null != binarySearchTree.search(322))
        {
            System.out.println("key is found");
        }
        else
        {
            System.out.println("key is not found");
        }
    }
}
