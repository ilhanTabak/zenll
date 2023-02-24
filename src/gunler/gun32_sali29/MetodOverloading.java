package gunler.gun32_sali29;

public class MetodOverloading {


    public static void main(String[] args) {


        System.out.println(kucukSayi(3,4));




    }

    public static int kucukSayi(int a, int b) {

        int min = 0;

        if (a < b) {

            min = a;
        } else {

            min = b;
        }

           return min;
    }




}
