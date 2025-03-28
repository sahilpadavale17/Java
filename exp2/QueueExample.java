import java.util.LinkedList;
import java.util.Queue;

class QueueExample
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        System.out.println("Queue: " + queue);
        
        System.out.println("Dequeued from queue: " + queue.remove());
        System.out.println("Queue after dequeue: " + queue);
        
        System.out.println("Front element of the queue: " + queue.peek());
    }
}
