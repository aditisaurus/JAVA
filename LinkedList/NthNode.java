public class NthNode {

    public static void main(String args[]) {
        NthNode llist = new NthNode();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthfromLast(4);
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

    void printNthfromLast(int n) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (len < n)
            return;

        temp = head;

        for (int i = 0; i < len - n + 1; i++)
            temp = temp.next;

        System.out.print(temp.data);
    }
}
