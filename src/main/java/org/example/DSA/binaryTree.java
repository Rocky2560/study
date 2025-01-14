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

        public void inOrder(TreeNode root)
        {
            if (root == null)
            {
                return ;
            }
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(TreeNode root)
        {
            if (root == null)
            {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }

        //Stack implementation to print the sata postorder
    public void preOrderStack(TreeNode root)
    {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty())
        {
            if (current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else
            {
                TreeNode temp = stack.peek().right;
                if (temp == null)
                {
                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right)
                    {
                        temp = stack.pop();
                        System.out.println(temp.data + " ");
                    }
                }
                else
                {
                    current = temp;
                }
            }
        }
    }
        //Stack impleemntation to print the data inorder
    public void inOrderStack()
    {
    if ( root == null)
    {
        return;
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;
    while (!stack.isEmpty() || temp != null)
    {
        if (temp != null)
        {
            stack.push(temp);
            temp = temp.left;
        }
        else
        {
            temp = stack.pop();
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

    }

        //Stack implementation to print the data preorder
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
//            binaryTree.preOrder(binaryTree.root);
//            binaryTree.preOrderStackImpl();
//            binaryTree.postOrder(binaryTree.root);
//            binaryTree.inOrderStack();
            binaryTree.preOrderStack(binaryTree.root);


        }


}
