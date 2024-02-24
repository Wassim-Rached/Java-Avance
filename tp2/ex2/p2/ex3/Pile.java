package ex2.p2.ex3;

import java.util.ArrayList;

public class Pile {
    private final ArrayList<Integer> T = new ArrayList<Integer>();
    private int sommet;
    public Pile() {sommet=-1;}
    Pile(int t) {sommet=-1;}
    public void empiler(Integer elt) {sommet++;T.add(elt);}
    public void depiler() {T.remove(sommet);sommet--;}
    public Integer som() {return T.get(sommet);}
    public void vider() {T.clear();sommet=-1;}
    public void afficher(){
        for (int i=0;i<=sommet; i++)
            System.out.println(T.get(i)+" ");}
    public boolean pileVide() {return (sommet==-1);}
    public boolean pilePleine() {return (sommet==T.size()-1);}
}
