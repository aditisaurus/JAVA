import java.util.*;

class Node {
    int data;
    Node left, right;
     Node(int item) {
          data = item;
         left=right=null;
     }

}


public class LevelPrint {
     Node root;

     public static void main(String args[])
     {
        LevelPrint tree = new LevelPrint();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.traversal(tree.root);
     }
      
     void traversal(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                root = q1.poll();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q2.offer(root.left);
                }
                if (root.right != null) {
                    q2.offer(root.right);
                }
            }
            System.out.println();
            while (!q2.isEmpty()) {
                root = q2.poll();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q1.offer(root.left);
                }
                if (root.right != null) {
                    q1.offer(root.right);
                }
            }
            System.out.println();
        }
     }
    
}
