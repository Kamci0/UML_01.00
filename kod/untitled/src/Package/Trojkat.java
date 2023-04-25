package Package;

public class Trojkat extends Ma_katy{
    protected int wysokosc;
    protected int bok_a;
    protected int bok_b;
    protected int bok_c;

    public Trojkat(int id, String kolor, String przezroczystosc, int wysokosc, int bok_a, int bok_b, int bok_c) {
        super(id, kolor, przezroczystosc, (bok_a + bok_b + bok_c), ((bok_a * wysokosc) / 2), (3), (180), (0), (0), (3));
        this.wysokosc = wysokosc;
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
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

    public int getBok_c() {
        return bok_c;
    }

    public void setBok_c(int bok_c) {
        this.bok_c = bok_c;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s, bok c: %s, wysokosc: %s", this.getBok_a(), this.getBok_b(), this.getBok_c(), this.getWysokosc());
    }
}
