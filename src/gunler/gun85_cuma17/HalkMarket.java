package gunler.gun85_cuma17;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class HalkMarket {
    public static void main(String[] args) {
        //  Queue<String> queueMusteriler = new LinkedList<>(); //This is not thread safe
        Queue<String> queueMusteriler = new ArrayBlockingQueue<>(100); //This is thread safe
        //Add some customers
        queueMusteriler.add("Ahmet");
        queueMusteriler.add("Mehmet");
        queueMusteriler.add("Hasan");
        queueMusteriler.add("Cemil");
        queueMusteriler.add("Can");
        queueMusteriler.add("Zeki");
        queueMusteriler.add("Ayşe");
        queueMusteriler.add("Melike");
        queueMusteriler.add("Mustafa");
        queueMusteriler.add("Ali");

        System.out.println("Markette işlem için bekleyen Müşteriler : " + queueMusteriler);

        Kasiyer kasiyer1 = new Kasiyer(1,queueMusteriler);
        kasiyer1.islemYap(); //Single Therad method
        kasiyer1.start();
        Kasiyer kasiyer2 = new Kasiyer(2,queueMusteriler);
        kasiyer2.islemYap();
        kasiyer2.start();
        Kasiyer kasiyer3 = new Kasiyer(3,queueMusteriler);
        kasiyer3.islemYap();
        kasiyer3.start();

        int kasiyerSayisi = 3;
        for (int i = 1; i <= kasiyerSayisi; i++) {
            Kasiyer kasiyer = new Kasiyer(i,queueMusteriler);
            kasiyer.start();
        }
    }
}
