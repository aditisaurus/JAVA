class Node{
    int data;
     Node left, right;
     public Node(int item){
         data = item;
         left = right = null;
     }
}


public class Size {

    Node root;
    public static  void main(String args[])
    {
        Size tree = new Size();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("The size is "+ tree.findSize());
    }
    int findSize(Node node)
    {
        if (node == null)
            return 0;
        else
            return(findSize(node.left) + 1 + findSize(node.right));

        
    }

    int findSize()
    {
        return findSize(root);
    }

}
