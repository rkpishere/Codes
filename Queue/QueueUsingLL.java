package Queue;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;
     Node(int data){
        this.data=data;
        next=null;
     }
    }
    static class Queue {
        static Node head=null;
        static Node tail=null;    
    
    public  boolean isEmpty(){
        return head==null &&  tail==null;
    }
    public  void add(int data){
Node newNode=new Node(data);

if(tail==null){
    head=newNode;
   tail=newNode;
   return;
}
tail.next=newNode;
tail=newNode;
    }

    public  int remove(){
        int front=head.data;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(head==tail){
            tail=null;
            
        }
        head=head.next;
        return front;
    }
    public  int peek(){
        if(isEmpty())return -1;
        return head.data;
    }
}
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
