package genericqueue1;

public class QueueDemo {

    public static void main(String[] args) {
        GenericQueue<Integer> q = new GenericQueue<Integer>();
        
       
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
