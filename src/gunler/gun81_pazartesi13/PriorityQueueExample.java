package gunler.gun81_pazartesi13;



    import java.util.PriorityQueue;

    public class PriorityQueueExample {

        public static void main(String[] args) {

            PriorityQueue priority = new PriorityQueue();
            priority.add(20);
            priority.add(15);
            priority.add(5);
            priority.add(50);
            priority.add(18);

            // When retrieving the element each time it gives according to natural order (from small to bigger)
            //System.out.println("priority = " + priority);  // However when listing
            // the elements does not care the natural order, only focus on giving the correct number
            System.out.println(priority.peek());
            System.out.println(priority.poll());
            System.out.println(priority.peek());
            System.out.println(priority.poll());
            System.out.println(priority.peek());

            PriorityQueue priority2 = new PriorityQueue();
            priority2.add("Aaba");
            priority2.add("Zab");
            priority2.add("Baa");
            priority2.add("Aaaa");

            System.out.println("priority2 = " + priority2);
            System.out.println(priority.peek());
            System.out.println(priority.poll());
            System.out.println(priority.peek());
            System.out.println(priority.poll());
            System.out.println(priority.peek());

            // get method can not be used in PriorityQueue
            // Because its focus is always giving the first element according to natural order
            // priority.get(0);

        }
    }



