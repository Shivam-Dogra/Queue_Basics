package DSA.Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

     class Node{
        int value;
        Node next;

        Node(int data){
            this.value = data;
        }
     }

     //Queue constructor
     public Queue(int data){
        //create node
        Node newNode = new Node(data);
        first = newNode;
        last =  newNode;
        length = 1;
     }

     
    //print Queue
    public void print(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //get first
    public void getFirst(){
        System.out.println("First: " + first.value );
    }

    //get last
    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    //get length
    public void getLength(){
        System.out.println("Length: " + length);
    }

    //Queue: Dequeue -> remove first node -> FIFO
    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }
        else {
           first = first.next;
           temp.next = null;
        }
        length--;
        return temp;
    } 

    //Queue: Enqueue -> Add new node at end of queue
    public void enqueue(int value){
        //create node
         Node newNode = new Node(value);
         //case 1 : queue is empty
         if(length == 0){
            first = newNode;
            last = newNode;
         }
         else {
            //case 2:  queue is not empty
            last.next = newNode;
            last = newNode;
         }
         length++;
    
    }
    
}
