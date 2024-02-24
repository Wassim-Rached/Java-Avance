package ex1;

public class PaireBis<X, Y> {
    private X x;
    private Y y;

    public PaireBis(X premier, Y second) {
        this.x = premier;
        this.y = second;
    }

    public void afficher() {
        System.out.println("premier=" + x + ", second=" + y);
    }


    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

}
