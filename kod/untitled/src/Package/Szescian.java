package Package;

public class Szescian extends Przestrzenna{
    protected int krawedz_a;

    public Szescian(int id, String kolor, String przezroczystosc,int krawedz_a) {
        super(id, kolor, przezroczystosc, (krawedz_a*6), (int)(6 * Math.pow(krawedz_a,2)), (int)(Math.pow(krawedz_a, 3)));
        this.krawedz_a = krawedz_a;
    }

    public int getKrawedz_a() {
        return krawedz_a;
    }

    public void setKrawedz_a(int krawedz_a) {
        this.krawedz_a = krawedz_a;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" krawedz a: %s", this.getKrawedz_a());
    }
}
