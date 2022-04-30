import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int item){
        data = item;
        left=right=null;
    }
}

public class LcaBst {
    Node root;

    public static void main(String args[])
    {
        LcaBst tree = new LcaBst();
        tree.root = new Node(10);
        tree.root.left = new Node(-10);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(60);
        tree.root.right.left = new Node(25);
    
        Node t =tree.lca(tree.root, 5, 3);
        System.out.println("LCA of 5 and 3 is " + t.data);
    }

    public Node lca (Node root, int n1, int n2)
    {
        if(root == null)
        return null;

        if(root.data > Math.max(n1 , n2))
            return lca(root.left, n1, n2);

        
         if(root.data < Math.max(n1, n2))
            return lca(root.right, n1, n2);
        
         return root;
    }



    
}
