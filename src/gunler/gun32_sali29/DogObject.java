package gunler.gun32_sali29;

public class DogObject {

    public static void main(String[] args) {

        // ClassName    // objectName       // new keyword      // ClassName/Constructor
        Dog             dog        =         new                   Dog();

        Dog dog2 = new Dog();

        Dog dog3 = new Dog();

        // "." operatorunu kullanarak template class taki field ve methodlara ulasabiliyoruz
        dog.ad = "Artis";
        dog.cins = "Dalmacyali";
        dog.renk = "Siyah&Beyaz";
        dog.yas = 6;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);

        dog.havla();
        dog.isir();



        // object uzerinden ulasilan field a yeni deger assign etmek mumkun
        dog.cins = "Doberman";
        System.out.println("dog.cins = " + dog.cins);

        // Ayni methodu projede ihtiyac oldukca tekrardan cagirmak kullanmak mumkun
        dog.havla();
        dog.havla();
        dog.havla();

        // Ayni classdan olusturlmus farkli objectler ayni fieldda farkli degerler tasiyabilir
        dog2.ad = "Max";
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog2.ad = " + dog2.ad);

        // Default degerler
        // String default deger = null
        System.out.println("dog3.ad = " + dog3.ad);

        // int default deger = 0
        System.out.println("dog3.yas = " + dog3.yas);




        // char default value = //u00000 /



    }





}
