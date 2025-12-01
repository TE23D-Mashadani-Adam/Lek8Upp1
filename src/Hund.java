public class Hund extends Djur implements Dresserad{

    public Hund() {
        super(5, 20000);
    }

    @Override
    String Läte() {
        return "Voff";
    }

    void spåra(String bite) {
        System.out.println("Spårar " + bite);
    }

    @Override
    public void apport() {
        System.out.println("Apport");
    }

    @Override
    public void kom() {
        System.out.println("Kom");  
    }

    @Override
    public void sitt() {
        System.out.println("Sitt");
    }

}
