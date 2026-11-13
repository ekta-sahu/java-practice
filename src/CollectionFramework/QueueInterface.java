package CollectionFramework;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args){

        //Queue - FIFO
        //use offer & poll instead of add & remove as they can throw exceptions, (offer return ture,false & poll returns null )
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

        //Dequeue(Interface) --> ArrayDeque
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.offerFirst(0);
        adq.offerLast(2);
        adq.pollLast();
        System.out.println(adq);

        //PriorityQueue - by default the peek is minimum
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(1);
        pq.offer(2);
        pq.add(0);
        System.out.println(pq.peek());
    }
}
