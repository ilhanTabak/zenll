package gunler.gun32_sali29;

public class BaskentlerMethod {


    public static void main(String[] args) {


        islem(3,4,'+');
        islem(10,20,'*');
        islem(30,40,'-');



    }
    public static void islem(int a,int b,String operator){

        switch (operator){

            case "carp":
                carpma(a,b);
            case "bol":
                bolme(a,b);
            case"topla":
                toplama(a,b);




        }

    }


    public static void islem(int a,int b,char operator){

        switch (operator){
            case '*':
                carpma(a,b);
                break;

            case '/':
                bolme(a,b);
                break;
            case '-':
                cikarma(a,b);
                break;
            case '+':
                toplama(a,b);
                break;
            case '%':
                modul(a,b);
                break;
            default:
        }






    }

    public static void toplama(int a,int b){

        System.out.println("toplam= "+(a+b));




    }

    public static void cikarma(int a,int b){

        System.out.println("cikarma= "+(a-b));


    }
    public static void carpma(int a,int b){

        System.out.println("carpma ="+(a*b));


    }

    public static void bolme(int a,int b){

        System.out.println("bolme= " +(a/b));


    }

    public static void modul(int a,int b){

        System.out.println("modul= " +(a%b));


    }

}