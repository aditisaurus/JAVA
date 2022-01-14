public class Deletion {

    public static void main(String args[]) {
        Deletion llist = new Deletion();

        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);

        System.out.println("Deleting the list");
        llist.deleteList();

        System.out.print("Linked list deleted");
    }

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteList() {
        head = null;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
