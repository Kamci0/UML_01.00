package Package;

public class Prostokat extends  Ma_katy{
    protected int bok_a;
    protected int bok_b;

    public Prostokat(int id, String kolor, String przezroczystosc, int bok_a, int bok_b) {
        super(id, kolor, przezroczystosc, ((2*bok_a) + (2*bok_b)), (bok_a*bok_b), (4), (360), (Math.sqrt((Math.pow(bok_a,2)+ Math.pow(bok_b,2)))), (Math.sqrt((Math.pow(bok_a,2)+ Math.pow(bok_b,2)))), (4));
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }

    public int getBok_a() {
        return bok_a;
    }

    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    public int getBok_b() {
        return bok_b;
    }

    public void setBok_b(int bok_b) {
        this.bok_b = bok_b;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s", this.getBok_a(), this.getBok_b());
    }
}
