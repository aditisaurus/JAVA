class Node {
    int data;
    Node left, right;

    Node (int item)
    {
        data = item;
        left = right = null;
    }
}


public class bstSearch {
    Node root;

    public static void main(String args[])
    {
        bstSearch tree = new bstSearch();
        tree.root = new Node(10);
        tree.root.left = new Node(-5);
        tree.root.right = new Node(25);
        tree.root.left.left = new Node(-10);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(36);
          System.out.print(tree.search(tree.root, 25).data);
    }

    Node search(Node root , int key)
    {
        if(root == null)
        return null;

        if(root.data == key)
        return root;

        else if(root.data < key)
        return search (root.right, key);
        else 
        return search (root.left, key);
    }
}
