package gunler.gun81_pazartesi13;



    import java.util.*;

    public class SetExample {

        public static void main(String[] args) {

            Set<Integer> mySet = new HashSet<>();
            mySet.add(10);
            mySet.add(20);
            mySet.add(30);
            mySet.add(50);
            mySet.add(100);
            mySet.add(100);
            mySet.add(100);

            System.out.println("mySet = " + mySet);

            System.out.println("mySet.size() = " + mySet.size());

            List<String> list = Arrays.asList("15","15","a","c","rr","c","t");

            System.out.println("list = " + list);

            Set<String> mySet2 = new HashSet<>(list);

            System.out.println("mySet2 = " + mySet2);

            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(500);
            treeSet.add(100);
            treeSet.add(10);
            treeSet.add(5);
            treeSet.add(7000);
            treeSet.add(500);

            System.out.println("treeSet = " + treeSet);

            System.out.println("treeSet.add(10) = " + treeSet.add(10)); // false
            System.out.println("treeSet.add(50) = " + treeSet.add(50)); // true

            System.out.println("treeSet = " + treeSet);

        }
    }



