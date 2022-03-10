class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data= item;
    }
}

public class Insertion {
    Node root;

    public static void main(String args[])
    {
        Insertion tree = new Insertion();
        tree.root = new Node(10);
        tree.root.left = new Node(-5);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(18);

        System.out.print(tree.insert(tree.root, 6));
    }

    Node insert (Node root, int data)
    {
       Node node = new Node(data);
       if(root == null)
       {
           return node;
       }

       Node parent = null, current = root;
       while(current != null)
       {
           parent = current;
           if(current.data <= data)
           current = current.right;
           else
           current = current.left;
       }

       if(parent.data <= data)
       parent.right = node;
         else
         parent.left = node;
         
         return root;

    }
}

