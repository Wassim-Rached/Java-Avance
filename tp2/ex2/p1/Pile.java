package ex2.p1;

public class Pile<U>{
    private final U[] T = (U[]) new Object[100];
    private int sommet;
    public Pile() {sommet=-1;}
    public Pile(int t) {sommet=-1;}
    public void empiler(U elt) {sommet++;T[sommet]=elt;}
    public void depiler() {sommet--;}
    public U som() {return T[sommet];}
    public void vider() {sommet=-1;}
    public void afficher(){
        for (int i=0;i<=sommet; i++)
            System.out.println(T[i]+" ");}
    public boolean pileVide() {return (sommet==-1);}
    public boolean pilePleine() {return (sommet==T.length-1);}
}