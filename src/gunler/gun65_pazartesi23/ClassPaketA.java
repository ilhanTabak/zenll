package gunler.gun65_pazartesi23;

import gunler.gun67_sali24.AccessModifiers;
import gunler.gun67_sali24.ClassA;

public class ClassPaketA extends AccessModifiers {

    public static void main(String[] args) {


        AccessModifiers accessModifiers=new AccessModifiers();

        accessModifiers.name="Baska bir paket";
        accessModifiers.publicMethod();

        ClassPaketA classPaketA=new ClassPaketA();
        classPaketA.publicMethod();
        classPaketA.Tcno=12356;
        



    }


}
