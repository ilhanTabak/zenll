package gunler.gun64_cuma20;

public class Child extends ParentClass {


    public Child() {


        System.out.println("child constracker");
    }

    int idNumber=1005;

    int referanceNumber;

    String keyword;



    public void testDriver(){

        System.out.println("child test");
    }


    public void idCehck(){

        System.out.println("child id number"+this.idNumber);
        System.out.println("parent id number"+super.idNumber);



    }

    public void testBothDriver(){

        this.testDriver();
        super.testDriver();

    }
}




