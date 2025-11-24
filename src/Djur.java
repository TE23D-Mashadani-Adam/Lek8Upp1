public class Djur {
    protected double vikt;
    protected int energi;
    protected Boolean lever;

    static int antal_djur = 0;

    public Djur(double vikt, int energi) {
        this.vikt = vikt;
        this.energi = energi;
        this.lever = true;

        antal_djur++;
    }

    void äta(int energi){
        energi += 1000;
    }

    void spring(int meter){
        energi -= (vikt * meter);
    }

    String Läte(){
        return "Djuret låter";
    }

    
}
