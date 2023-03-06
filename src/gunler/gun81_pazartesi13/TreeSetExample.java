package gunler.gun81_pazartesi13;



  import java.util.TreeSet;

    public class TreeSetExample {

        public static void main(String[] args) {

            // Treeset sorts objects in ascending order
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("Mavi");
            treeSet.add("Yesil");
            treeSet.add("Gri");
            treeSet.add("Yesil");
            treeSet.add("Acik Yesil");
            treeSet.add("Beyaz");
            treeSet.add("15");
            treeSet.add("5");
            treeSet.add("25");
            treeSet.add("A");
            treeSet.add("&");
            treeSet.add("%");

            System.out.println("treeSet = " + treeSet);

            for(String each : treeSet){
                System.out.println(each.hashCode());
            }

            TreeSet<Integer> treeSet2 = new TreeSet<>();
            treeSet2.add(15);
            treeSet2.add(5);
            treeSet2.add(25);

            System.out.println("treeSet2 = " + treeSet2);

        }
    }

