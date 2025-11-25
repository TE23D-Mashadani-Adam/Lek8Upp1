public class Mus extends Djur {

    public Mus() {
        super(1, 5000);
    }

    @Override
    String Läte() {
        return "Piip";
    }

    void klättra() {
        System.out.println("Musen klättrar");
    }

}
