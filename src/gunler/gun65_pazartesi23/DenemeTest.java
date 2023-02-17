package gunler.gun65_pazartesi23;

import java.util.ArrayList;
import java.util.Scanner;

public class DenemeTest {

    public static void main(String[] args) {

        int k=1;
        int counter=0;


        int [] arr = {3, 1, 5, 4, 9, 120, 4, 6, 10};


        for (int i = 0; i <arr.length-1 ; i++) {



            for (int j = k; j <arr.length ; j++) {

                if(arr[i]==arr[j]){



                    counter++;

                    if(counter==1){

                        System.out.println(arr[i]);

                        break;

                    }


                }

            }

                  k++;
        }







    }
}
