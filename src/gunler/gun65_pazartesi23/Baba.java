package gunler.gun65_pazartesi23;

public class Baba extends Dede{


    String name;

    public Baba(String name,int kilo) {
        super(kilo);

        this.name = name;
    }


    public void babaHediye(){

        super.dedeHediye();
        


    }
}
