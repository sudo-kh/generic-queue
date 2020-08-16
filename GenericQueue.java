package genericqueue1;

import java.util.ArrayList;

/**
 ** Implementing a Generic Queue as an ArrayList
 */
public class GenericQueue<T> {

    private ArrayList<T> queue;

    public GenericQueue() {
        queue = new ArrayList<T>();
    }

    /**
     * Return the first element in the queue without disturbing the contents of
     * the queue.
     * @return the first element in the queue or null if the queue is empty
     */
    public T front() {
        T returnVal = null;
        if (!queue.isEmpty()) {
            returnVal = queue.get(0);
        }
        return returnVal;
    }

    /**
     * Remove the first element in the queue.
     * @return the first element in the queue or null if the queue is empty
     */
    public T dequeue() {
        T returnVal = null;
        if (!queue.isEmpty()) {
            returnVal = queue.remove(0);
        }
        return returnVal;
    }

    /**
     * Add an object to the end of the queue.
     * @param data The data to be added to the queue.
     * @return true or false indicating if the operation was successful
     */
    public boolean enqueue(T data) {
        queue.add(data);
        return true;
    }
}
