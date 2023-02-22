package gunler.gun64_cuma20;

import java.util.ArrayList;

public class ShapeList {


    public static void main(String[] args) {

        Shape[]shapes=new Shape[3];

        shapes[0]=new Square();
        shapes[1]=new Circle();
        shapes[2]=new triangle();

        for(Shape shape:shapes){


            System.out.println(shape.getClass());
        }


        ArrayList<Shape> shapeList=new ArrayList<>();
        shapeList.add(new Square());
        shapeList.add(new Circle());
        shapeList.add(new triangle());

        for(Shape shape:shapeList){

            System.out.println(shape.getClass().getSimpleName());


        }
    }
}
