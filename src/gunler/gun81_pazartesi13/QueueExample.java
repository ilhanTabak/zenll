package gunler.gun81_pazartesi13;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        // FIFO
        System.out.println("que = " + que);

        // First Out / removes first element in the list
        String name = que.remove();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        // First Put / removes first element in the list
        name = que.poll();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        // gets the first element in the order
        name = que.peek();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        // Difference between remove() and poll() is that
        // remove throws exception, poll not
        que.poll();
        que.poll();
        que.poll();  // Empty list but no exception

        System.out.println("que = " + que);

        try{
            que.remove(); // empty list with exception
        }catch (NoSuchElementException n){
            System.out.println("Your list is empty");
        }

    }
}