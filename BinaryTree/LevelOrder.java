import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item)
    {
        data= item;
        left = right = null;
    }
}
public class LevelOrder {
    Node root;

public static void main(String args[])
{
    LevelOrder tree_level = new LevelOrder();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
System.out.print("Level Order Traversal of Binary Tree is-");
tree_level.printLevelOrder();

}

void printLevelOrder()
{
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while(q.size() > 0)
    {
        Node tempNode = q.poll();
        System.out.print(tempNode.data + " ");
        if(tempNode.left != null){
            q.add(tempNode.left);
        }
        if(tempNode.right != null){
            q.add(tempNode.right);
        }
    }
}
    
}