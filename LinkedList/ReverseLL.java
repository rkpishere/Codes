package LinkedList;

public class ReverseLL {
     Node head = null;
    private int size;

    ReverseLL() {
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
    public int listSize() {
       return size;
    }
    // reverse by iterative method
    public void reverseIterate(){
if(head==null){
    return;
}
if(head.next==null){
    return;
}
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nexNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nexNode;

        }
        head.next=null;
        head=prevNode;
    }
    // reverse by recursive method
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newhead = reverseRecursive(head.next);
head.next.next=head;
head.next=null;
return newhead;
    }

    public static void main(String[] args) {
    ReverseLL list=new ReverseLL();
    list.insertEnd("1");    
    list.insertEnd("2");    
    list.insertEnd("3");    
    list.insertEnd("4");
    list.display();    
    list.head=list.reverseRecursive(list.head);
    list.display();
    }
}
