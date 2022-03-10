class Node {
    int data;
    Node left, right;

    Node (int item)
    {
        data = item;
        left = right = null;
    }
}


public class bstCheck {
    Node root;

    public static void main(String args[])
    {
        bstCheck tree = new bstCheck();
        tree.root = new Node(10);
        tree.root.left = new Node(10);
        tree.root.right = new Node(19);
        tree.root.left.left = new Node(-5);
        tree.root.right.left = new Node(17);
        tree.root.right.right = new Node(21);
        System.out.print(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE ));
    }

    boolean isBST(Node root, int min, int max)
    {
        if(root == null)
        return true;

        if(root.data<=min || root.data>max)
        return false;

        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

}
