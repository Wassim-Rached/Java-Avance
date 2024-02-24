package ex1;

class Triple<X, Y> extends PaireBis<X, Y> {
    private X z;

    public Triple(X premier, Y second, X troisieme) {
        super(premier, second);
        this.z = troisieme;
    }

    public void afficher() {
        System.out.println("premier=" + getX() + ", second=" + getY() + ", troisieme=" + z);
    }

    public X getZ() {
        return z;
    }

    public void setZ(X z) {
        this.z = z;
    }

}
