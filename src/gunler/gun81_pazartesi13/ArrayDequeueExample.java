package gunler.gun81_pazartesi13;



    import java.util.ArrayDeque;

    public class ArrayDequeueExample {

        public static void main(String[] args) {

            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(20);
            arrayDeque.add(10);
            arrayDeque.add(5);
            arrayDeque.add(15);

            System.out.println("arrayDeque = " + arrayDeque);

            // retrieves the first element
            System.out.println(arrayDeque.peekFirst());
            // retrieves the last element
            System.out.println(arrayDeque.peekLast());

            System.out.println(arrayDeque.poll());
            System.out.println("arrayDeque = " + arrayDeque);

            arrayDeque.addFirst(30);
            System.out.println("arrayDeque = " + arrayDeque);
            System.out.println(arrayDeque.peekFirst());

            arrayDeque.addLast(40);
            System.out.println("arrayDeque = " + arrayDeque);
            System.out.println(arrayDeque.peekLast());


        }
    }


