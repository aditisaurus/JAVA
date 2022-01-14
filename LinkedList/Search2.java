
public class Search2 {
    public static void main(String args[]) {
        Search2 llist = new Search2();

        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);

        if (llist.searching(llist.head, 21))
            System.out.print("Yes");

        else
            System.out.print("No");
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

    Node head;

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public boolean searching(Node head, int x) {
        if (head == null)
            return false;

        if (head.data == x)
            return true;

        return searching(head.next, x);
    }
}
