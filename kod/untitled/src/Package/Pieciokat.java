package Package;

public class Pieciokat extends Ma_katy{
    protected int bok_a;
    protected int bok_b;
    protected int bok_c;
    protected int bok_d;
    protected int bok_e;

    public Pieciokat(int id, String kolor, String przezroczystosc, int bok_a, int bok_b, int bok_c, int bok_d, int bok_e) {
        super(id, kolor, przezroczystosc, (bok_a + bok_b + bok_c + bok_d + bok_e), (int) Math.sqrt((bok_a + bok_b + bok_c + bok_d + bok_e) * ((bok_a + bok_b + bok_c + bok_d + bok_e) - bok_a) * ((bok_a + bok_b + bok_c + bok_d + bok_e) - bok_b * ((bok_a + bok_b + bok_c + bok_d + bok_e)-bok_c))), (5), (540), (Math.min ((1.618 * bok_a), (Math.min((1.618 * bok_b), (Math.min((1.618 * bok_c), (Math.min((1.618*bok_d), (1.618 * bok_c))))))))), (Math.max ((1.618 * bok_a), (Math.max((1.618 * bok_b), (Math.max((1.618 * bok_c), (Math.max((1.618*bok_d), (1.618 * bok_c))))))))), (5));
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
        this.bok_d = bok_d;
        this.bok_e = bok_e;
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

    public int getBok_d() {
        return bok_d;
    }

    public void setBok_d(int bok_d) {
        this.bok_d = bok_d;
    }

    public int getBok_e() {
        return bok_e;
    }

    public void setBok_e(int bok_e) {
        this.bok_e = bok_e;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s, bok c: %s, bok d: %s, bok e: %s", this.getBok_a(), this.getBok_b(), this.getBok_c(), this.getBok_d(), this.getBok_e());
    }
}
