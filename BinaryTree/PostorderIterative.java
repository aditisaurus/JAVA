import java.util.*;

class Node{
    int data;
    Node left, right;
     Node (int item){
         data = item;
         left=right=null;
     }
}

public class PostorderIterative {
    Node root;

public static void main(String args[])
{
    PostorderIterative tree = new PostorderIterative();
    tree.root = new Node(10);
    tree.root.left = new Node(0);
    tree.root.right = new Node(-10);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    tree.root.right.right = new Node(11);
    tree.iterativePostorder(tree.root);
}

void iterativePostorder(Node root)
{
    if(root == null)
    return;
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    s1.push(root);
    while(!s1.isEmpty())
    {
        root = s1.pop();
        s2.push(root);
        if(root.left!=null)
        s1.push(root.left);
        if(root.right!=null)
        s1.push(root.right);
    }
    while(!s2.isEmpty())
    {
        root=s2.pop();
        System.out.print(root.data);

    }
}

}
