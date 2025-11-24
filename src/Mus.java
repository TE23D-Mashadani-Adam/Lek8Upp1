public class Mus extends Djur {
    
    public Mus(double vikt, int energi){
        super(1, 5000);
    }

    @Override
    String Läte() {
        return "Piip";
    }

    void klättra(){
        System.out.println("Musen klättrar");
    }

    
}
