public class Katt extends Djur{

    public Katt(double vikt, int energi){
        super(3, 10000);
    }

    @Override
    String Läte() {
        return "Miauu";
    }

    void leka(String sak){
        System.out.println("Katten leker med " + sak);
    }

    

}
