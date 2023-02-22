package gunler.gun64_cuma20;

public class deneme {


    public static void main(String[] args) {

        int[] arr = {9, 10, 11, 23, 30, 50, 60};


        int sonuc=kedi(arr,12);
        System.out.println(sonuc);


    }



    public static int kedi(int[] denemek,int a){

          int min=Integer.MAX_VALUE;
          int sonuc=0;

        for (int i = 0; i <denemek.length ; i++) {

          if((Math.abs(denemek[i]-a)<min)){

              min=(Math.abs(denemek[i]-a));
                }

            }

        for (int i = 0; i <denemek.length ; i++) {

            if(a+min==denemek[i]||a-min==denemek[i]){


                sonuc=denemek[i];
            }

        }

        return sonuc;

        }



    }



