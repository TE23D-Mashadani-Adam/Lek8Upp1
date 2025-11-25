public class App {
    public static void main(String[] args) throws Exception {
        

        Djur[] djurfält = new Djur[5];

        djurfält[0] = new Hund();
        djurfält[1] = new Hund();
        djurfält[2] = new Katt();
        djurfält[3] = new Katt();
        djurfält[4] = new Mus();

        for (Djur djur : djurfält) {
            if (djur instanceof Hund) {
                Hund h1 = (Hund)djur;
                h1.spåra("Katt");
            }
            else if(djur instanceof Katt){
                ((Katt)djur).leka("Bomull");
            }
            else if (djur instanceof Mus){
                ((Mus)djur).klättra();
            }

        }

    }
    }
    

        
    

