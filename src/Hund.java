public class Hund extends Djur {

public Hund() {
    super(5, 20000);
}

@Override
String Läte() {
    return "Voff";
}

void spåra(String bite){
    System.out.println("Spårar "+ bite);
}

}
