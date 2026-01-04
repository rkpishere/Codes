package Queue;

public class CircularQueueArray {
    static class Queue {
     int arr[];
     int size;
     int rear=-1;
     int front=-1;
        
    Queue(int n){
        arr= new int [n]; 
        this.size=n;

    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public boolean isFull(){
        return ((rear+1)%size==front);
    }
    //enqueue;
public void add(int data){
    if(isFull()){
    System.out.println("Queue is full");
return;}
if(front==-1){
    front=0;
}
rear=(rear+1)%size;
arr[rear]=data;
    }
//dequeue;
public int remove(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    int result=arr[front];
    if(rear==front)
    {
rear=0;
front=0;
    }
   else{

    front=(front+1) % size;
   }
    return result;
}
//front;
public int peek(){
if(isEmpty()){
    System.out.println("Queue is empty");
    return -1;
}
return arr[front];
}
public void display(){
    int i=front;
   do {
        System.out.println(arr[i]);
        i=(i+1)%size;
    }
    while(i!=front);
}
    }

    public static void main(String[] args) {
        Queue q= new Queue(5);
       
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.display();
       System.out.println( "Removed :"+q.remove());
        q.add(6);
        q.display();
    }
}
