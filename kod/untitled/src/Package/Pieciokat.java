package Package;

/**
 * klasa Pieciokat dziedziczaca z klasy {@link Ma_katy}
 */
public class Pieciokat extends Ma_katy{
    /**
     * bok pieciokata
     */
    protected int bok_a;
    /**
     * bok pieciokata
     */
    protected int bok_b;
    /**
     * bok pieciokata
     */
    protected int bok_c;
    /**
     * bok pieciokata
     */
    protected int bok_d;
    /**
     * bok pieciokata
     */
    protected int bok_e;

    /**
     *konstruktor klasy Pieciokat
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param bok_a {@link Pieciokat#bok_a}
     * @param bok_b {@link Pieciokat#bok_b}
     * @param bok_c {@link Pieciokat#bok_c}
     * @param bok_d {@link Pieciokat#bok_d}
     * @param bok_e {@link Pieciokat#bok_e}
     */
    public Pieciokat(int id, String kolor, String przezroczystosc, int bok_a, int bok_b, int bok_c, int bok_d, int bok_e) {
        super(id, kolor, przezroczystosc, (bok_a + bok_b + bok_c + bok_d + bok_e), (int) Math.sqrt((bok_a + bok_b + bok_c + bok_d + bok_e) * ((bok_a + bok_b + bok_c + bok_d + bok_e) - bok_a) * ((bok_a + bok_b + bok_c + bok_d + bok_e) - bok_b * ((bok_a + bok_b + bok_c + bok_d + bok_e)-bok_c))), (5), (540), (Math.min ((1.618 * bok_a), (Math.min((1.618 * bok_b), (Math.min((1.618 * bok_c), (Math.min((1.618*bok_d), (1.618 * bok_c))))))))), (Math.max ((1.618 * bok_a), (Math.max((1.618 * bok_b), (Math.max((1.618 * bok_c), (Math.max((1.618*bok_d), (1.618 * bok_c))))))))), (5));
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
        this.bok_d = bok_d;
        this.bok_e = bok_e;
    }

    /**
     * getter dla boku pieciokata
     * @return {@link Pieciokat#bok_a}
     */
    public int getBok_a() {
        return bok_a;
    }

    /**
     * setter dla boku pieciokata
     * @param bok_a {@link Pieciokat#bok_a}
     */
    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    /**
     * getter dla boku pieciokata
     * @return {@link Pieciokat#bok_b}
     */
    public int getBok_b() {
        return bok_b;
    }

    /**
     * setter dla boku pieciokata
     * @param bok_b {@link Pieciokat#bok_b}
     */
    public void setBok_b(int bok_b) {
        this.bok_b = bok_b;
    }

    /**
     * getter dla boku pieciokata
     * @return {@link Pieciokat#bok_c}
     */
    public int getBok_c() {
        return bok_c;
    }

    /**
     * setter dla boku pieciokata
     * @param bok_c {@link Pieciokat#bok_c}
     */
    public void setBok_c(int bok_c) {
        this.bok_c = bok_c;
    }

    /**
     * getter dla boku pieciokata
     * @return {@link Pieciokat#bok_d}
     */
    public int getBok_d() {
        return bok_d;
    }

    /**
     * setter dla boku pieciokata
     * @param bok_d {@link Pieciokat#bok_d}
     */
    public void setBok_d(int bok_d) {
        this.bok_d = bok_d;
    }

    /**
     * getter dla boku pieciokata
     * @return {@link Pieciokat#bok_e}
     */
    public int getBok_e() {
        return bok_e;
    }

    /**
     * setter dla boku pieciokata
     * @param bok_e {@link Pieciokat#bok_e}
     */
    public void setBok_e(int bok_e) {
        this.bok_e = bok_e;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s, bok c: %s, bok d: %s, bok e: %s", this.getBok_a(), this.getBok_b(), this.getBok_c(), this.getBok_d(), this.getBok_e());
    }
}
