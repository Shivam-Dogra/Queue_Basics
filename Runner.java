package DSA.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        queue.getFirst();
        queue.getLast();
        
        System.out.println("");
        queue.dequeue();
        queue.print();
        queue.getFirst();
        queue.getLast();
    }
}
