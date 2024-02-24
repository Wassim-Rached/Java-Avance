package ex1;

public class Paire<T> {
    private T x, y;
    public Paire(T premier, T second) {
        this.x = premier;
        this.y = second;
    }
    public void afficher()
    {
        System.out.println("Premier = " + x + " Second = "+ y);
    }
}