package gunler.gun32_sali29;

public class CakeTest {

    public static void main(String[] args) {

        Cake cake1 = new Cake();
        cake1.isChoclate = true;
        cake1.slices = 10;
        cake1.baker = "Ayse";

        Cake cake2 = new Cake();
        cake2.isChoclate = false;
        cake2.slices = 10;
        cake2.baker = "Murat";

        cake1.eat();
        cake1.eat();
        cake2.eat();

    }
}





