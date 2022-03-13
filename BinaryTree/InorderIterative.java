import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class InorderIterative {
    Node root;

    public static void main(String args[])
    {
        InorderIterative tree = new InorderIterative();
        tree.root = new Node(10);
        tree.root.left = new Node(0);
        tree.root.right = new Node(-10);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(11);
        tree.iterativeInorder(tree.root);
    }
       void iterativeInorder(Node root)
       {
           if(root == null)
           return;
           Stack <Node> s = new Stack <Node>();
           while(true) {
               if(root!= null)
               {
                   s.push(root);
                   root = root.left;
               }
               else {
                   if(s.isEmpty())
                   {break;}
                   root=s.pop();
                   System.out.print(root.data);
                   root=root.right;
               }
           }

       }
}
