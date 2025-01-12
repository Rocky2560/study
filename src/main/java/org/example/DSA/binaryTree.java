package org.example.DSA;

import com.sun.source.tree.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class binaryTree {


    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

        public void createBinaryTree()
        {
            TreeNode treeNode1 = new TreeNode(9);
            TreeNode treeNode2 = new TreeNode(2);
            TreeNode treeNode3 = new TreeNode(3);
            TreeNode treeNode4 = new TreeNode(4);

            root = treeNode1;
            treeNode1.left = treeNode2;
            treeNode1.right = treeNode3;
            treeNode2. left = treeNode4;


        }

        public void preOrder(TreeNode root)
        {
            if (root == null)
            {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //Stack implementation to print the data
        public void preOrderStackImpl()
        {
            if (root == null)
            {
                return;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty())
            {
                TreeNode temp = stack.pop();
                System.out.print(temp.data + " ");
                if (temp.right != null)
                {
                    stack.push(temp.right);
                }
                if (temp.left != null)
                {
                    stack.push(temp.left);
                }
            }
        }

        public  static void main(String[] args) {

            binaryTree binaryTree = new binaryTree();
            binaryTree.createBinaryTree();
            binaryTree.preOrder(binaryTree.root);
            binaryTree.preOrderStackImpl();


        }


}
