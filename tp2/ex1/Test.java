package ex1;

public class Test {
    public static void main(String[] args) {
        Paire<Personne> p_personne = new Paire<>(new Personne("toto", 30), new Personne("titi", 40));
        Paire<String> p_string = new Paire<>("toto", "titi");
        Paire<Integer> p_int = new Paire<>(1, 2);

        p_personne.afficher();
        p_string.afficher();
        p_int.afficher();

        PaireBis<String,String> p_string_string = new PaireBis<>("RSI", "DSI");
        PaireBis<Double,Float> p_double_float = new PaireBis<>(15.5,2.4f);
        PaireBis<Integer,Personne> p_int_personne = new PaireBis<>(10, new Personne("Omar", 25));

        p_string_string.afficher();
        p_double_float.afficher();
        p_int_personne.afficher();

//        ex1.Triple<Integer, String, Double> t1 = new ex1.Triple<>(10, "Ali", 15.3);
//        ex1.Triple<Integer, Integer, String> t2 = new ex1.Triple<>(23, 15, "RSI");
//
//        t1.afficher();
//        t2.afficher();


    }

}
