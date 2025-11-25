public class Katt extends Djur{

    public Katt(){
        super(3, 10000);
    }

    @Override
    String Läte() {
        return "Miauu";
    }

    static void leka(String sak){
        System.out.println("Katten leker med " + sak);
    }

    

}
