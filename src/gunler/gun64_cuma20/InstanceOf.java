package gunler.gun64_cuma20;

public class InstanceOf {

    public static void main(String[] args) {

        Shape shape=new Circle();


        if(shape instanceof triangle){


            System.out.println("triangle");
        }else if(shape instanceof Square){

            System.out.println("square");


        }else if(shape instanceof Circle){


            System.out.println("circle");
        }
    }
}
