package Package;

public class Kwadrat extends Ma_katy{
    protected int bok_a;

    public Kwadrat(int id, String kolor, String przezroczystosc, int bok_a) {
        super(id, kolor, przezroczystosc, (bok_a*4), (bok_a * bok_a), (4), (360), (bok_a * 1.4), (bok_a * 1.4), (4));
        this.bok_a = bok_a;
    }

    public int getBok_a() {
        return bok_a;
    }

    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s", this.getBok_a());
    }
}
