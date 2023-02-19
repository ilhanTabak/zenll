package gunler.gun85_cuma17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Training2 {
    public static void main(String[] args) {
        File file = new File("src/gunler/gun85_cuma17/Data.text");

        Scanner satirOku = null;

        try {
            satirOku = new Scanner(file);
            System.out.printf("Dosyayi sistemde buldum");

            while (satirOku.hasNextLine()){

                System.out.println(satirOku.nextLine());




            }

        } catch (FileNotFoundException foundException){

            System.out.printf("Dosya sistemde yok");

        }
        catch (NoSuchElementException olamyansatir){

            System.out.printf("Oyle bir satti yok");



        }

        catch (Exception exp) {

           exp.printStackTrace();
        }

    }
}