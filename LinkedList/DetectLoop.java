public class DetectLoop {

    public static void main(String args[]) {
        DetectLoop llist = new DetectLoop();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        llist.head.next.next.next.next = llist.head;

        if (Loop(head))
            System.out.print("Loop found");
        else
            System.out.print("Loop not found");
    }

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static boolean Loop(Node h) {
        HashSet<Node> s = new HashSet();
        while (h != null) {
            if (s.contains(h))
                return true;

            s.add(h);
            h = h.next;
        }

        return false;
    }
}
