package gunler.gun81_pazartesi13;



   import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

    public class LoopWithIterator {

        public static void main(String[] args) {

            Set<Integer> nums = new HashSet<>();
            nums.add(10);
            nums.add(20);
            nums.add(30);
            nums.add(40);
            nums.add(50);
            nums.add(110);
            nums.add(120);
            nums.add(1100);
            nums.add(1200);
            nums.add(100);
            nums.add(70);
            nums.add(80);


            System.out.println("nums = " + nums);

            for(Integer num : nums){
                System.out.print(num + " | ");
            }

            System.out.println();
            System.out.println("//////////////////////");

            Iterator<Integer> it = nums.iterator();

            System.out.println(it.hasNext());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());

            Iterator<Integer> it1 = nums.iterator();

            while(it1.hasNext()){
                int val = it1.next();
                if(val > 1000){
                    it1.remove();
                }
            }

            System.out.println("nums = " + nums);

//        for(Integer num : nums){
//            if(num > 1000){
//                nums.remove(num);
//            }
//        }
//
//        System.out.println("nums = " + nums);

        }
    }




