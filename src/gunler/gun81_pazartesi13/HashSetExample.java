package gunler.gun81_pazartesi13;




import java.util.HashSet;

    public class HashSetExample {

        public static void main(String[] args) {

            HashSet<String> hashset = new HashSet<>();
            hashset.add("Mavi");
            hashset.add("Yesil");
            hashset.add("Gri");
            hashset.add("Yesil");
            hashset.add("Mavi");
            hashset.add("Beyaz");

            // Duplication is not allowed in SET
            System.out.println("hashset = " + hashset);

            for(String element : hashset){
                System.out.println("element. = " + element.hashCode());
            }
        }
    }


