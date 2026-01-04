package LinkedList;

public class SinglyLL {
    Node head = null;
    private int size;

    SinglyLL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first,last
    public void insertbeg(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    // insert end
    public void insertEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while ((currNode.next != null)) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        Node del = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            size--;
            head = head.next;
        }
        System.out.println(del.data + " is deleted");

    }

    // delete last
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;

        }
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        System.out.println(last.data + " is deleted");
        secondlast.next = null;

    }

    public void display() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // size
    public void listSize() {
        System.out.println("List size is: " + size);
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insertbeg("is");
        list.insertbeg("5");
        list.insertEnd("a");
        list.insertEnd("number");
        list.display();
        list.deleteFirst();
        list.listSize();
        list.display();
        list.deleteLast();
        list.display();
        list.listSize();

    }
}
