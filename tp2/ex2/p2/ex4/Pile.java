package ex2.p2.ex4;

import java.util.ArrayList;

public class Pile<U> {
    private final ArrayList<U> T = new ArrayList<U>();
    private int sommet;
    public Pile() {sommet=-1;}
    Pile(int t) {sommet=-1;}
    public void empiler(U elt) {sommet++;T.add(elt);}
    public void depiler() {T.remove(sommet);sommet--;}
    public U som() {return T.get(sommet);}
    public void vider() {T.clear();sommet=-1;}
    public void afficher(){
        for (int i=0;i<=sommet; i++)
            System.out.println(T.get(i)+" ");}
    public boolean pileVide() {return (sommet==-1);}
    public boolean pilePleine() {return (sommet==T.size()-1);}
}
