package gunler.gun85_cuma17;

import java.util.ArrayList;
import java.util.Queue;

public class Kasiyer extends Thread{
    private int kasiyer_Id;
    ArrayList<String> islemYapilanMusteriler;
    private int toplamCalismaSuresi;
    Queue<String> queueMusteriler;

    public Kasiyer(int kasiyer_Id, Queue<String> queueMusteriler) {
        this.kasiyer_Id = kasiyer_Id;
        this.islemYapilanMusteriler = new ArrayList<>();
        this.toplamCalismaSuresi = 0;
        this.queueMusteriler = queueMusteriler;
    }

    public void islemYap()  {//Single thread
        while (!queueMusteriler.isEmpty()){
            int sure = 1000 + (int) (Math.random() * 5000); //Her müşteri için simülasyon amaçlı rastgele oluşturulan işlem süresi( min 1 saniye mac. 5 saniye)
            if(!queueMusteriler.isEmpty()){
                String musteri = queueMusteriler.poll(); //Sıradaki müşteriyi işlem yapmak için queue dan alır.
                islemYapilanMusteriler.add(musteri); //Kasiyer işlem yaptığı müşteriyi listesine ekler
                toplamCalismaSuresi += sure; //Kasiyerin işlem yaptığı müşteriler için harcadığı toplam süre
                System.out.println("Kasiyer-" + kasiyer_Id + " ---> " + musteri + " nin işlemini yapıyor." + " -Süre : " + sure);
                try {
                    Thread.sleep(sure); //Simulasyon amaçlı müşteri için üretilen rastgele süre thread bekletilir.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("İşlem yapan Kasiyer : " + kasiyer_Id + " ---> Müşteriler : " + islemYapilanMusteriler + " - Toplam çalışma süresi = " + toplamCalismaSuresi);
    }
    @Override
    public void run(){//This method runs as multi-thread
        islemYap();
    }


    public int getKasiyer_Id() {
        return kasiyer_Id;
    }

    public void setKasiyer_Id(int kasiyer_Id) {
        this.kasiyer_Id = kasiyer_Id;
    }

    public ArrayList<String> getIslemYapilanMusteriler() {
        return islemYapilanMusteriler;
    }

    public void setIslemYapilanMusteriler(ArrayList<String> islemYapilanMusteriler) {
        this.islemYapilanMusteriler = islemYapilanMusteriler;
    }

    public int getToplamCalismaSuresi() {
        return toplamCalismaSuresi;
    }

    public void setToplamCalismaSuresi(int toplamCalismaSuresi) {
        this.toplamCalismaSuresi = toplamCalismaSuresi;
    }

    public Queue<String> getQueueMusteriler() {
        return queueMusteriler;
    }

    public void setQueueMusteriler(Queue<String> queueMusteriler) {
        this.queueMusteriler = queueMusteriler;
    }

    @Override
    public String toString() {
        return "Kasiyer{" +
                "kasiyer_Id=" + kasiyer_Id +
                ", islemYapilanMusteriler=" + islemYapilanMusteriler +
                ", toplamCalismaSuresi=" + toplamCalismaSuresi +
                ", queueMusteriler=" + queueMusteriler +
                '}';
    }
}