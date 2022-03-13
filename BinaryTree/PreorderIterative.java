import java.util.*;


class Node {
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left=right=null;
    }
}
public class PreorderIterative {
    Node root;
    public static void main(String args[])
    { 
    PreorderIterative tree = new PreorderIterative();
    tree.root = new Node(10);
    tree.root.left = new Node(0);
    tree.root.right = new Node(-10);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    tree.root.right.right = new Node(11);
    tree.iterativePreorder(tree.root);
    }

    void iterativePreorder(Node root)
    {
        if(root==null)
        return;
        Stack<Node> s = new Stack<Node>();
        s.add(root);
        while(!s.isEmpty())
        {
           root = s.pop();
           System.out.print(root.data);
           if(root.right != null)
           s.push(root.right);
           if(root.left != null)
           s.push(root.left);
        }
        
    }
}
