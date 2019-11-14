import java.util.*;

public class Trees {
    public static class Node {
        int key;
        Node left;
        Node right;
        Node()
        {
            left = null;
            right = null;
        }
        Node(int data)
        {
            this.data=data;
            left = null;
            right = null;
        }
    }
    public static Node in(int key)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static Node insert(Node root, int key)
    {
        if(root == null)
        {
            root = in(key);
            return root;
        }
        if(root.key > key)
        {
            root.left = insert(root.left,key);
        }
        else if(root.key < key)
        {
            root.right = insert(root.right,key);
        }
        return root;
    }
    public static int getHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int leftHeight = 1 + getHeight(root.left);
            int rightHeight = 1 + getHeight(root.right);

            return Math.max(leftHeight,rightHeight);
        }
    }
    static Stack<Integer> getOrder = new Stack<Integer>();
    public static void getLevelOrder(BST root)
    {
        int h = getHeight(root);
        for(int i = 0 ; i < h ; i++)
        {
            getLevel(root,i);
        }
        System.out.println();
    }
    public static void getLevel(BST root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == 0)
        {
            getOrder.push(root.data);
        }
        else
        {
            getLevel(root.left,level - 1);
            getLevel(root.right,level - 1);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(40);
        root = insert(root,30);
        root = insert(root,70);
        root = insert(root,20);
        root = insert(root,35);
        root = insert(root,50);
        root = insert(root,80);
        getLevelOrder(root);
        while(!getOrder.empty())
        {
            System.out.print(getOrder.peek() + " ");
            getOrder.pop();
        }
    }

}