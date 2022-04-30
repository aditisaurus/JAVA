class Node{
    int data;
    Node left,right;

    Node(int item){
        data = item;
        left=right=null;
    }
}

public class Lca {
    Node root;

    public static void main(String args[])
    {
        Lca tree = new Lca();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print(tree.lcaFind(tree.root, 4, 3));
    }
    public Node lcaFind(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        
        Node left = lcaFind(root.left, n1, n2);
        Node right = lcaFind(root.right, n1, n2);

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}

