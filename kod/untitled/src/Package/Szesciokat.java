package Package;

/**
 * klasa Szesciokat dziedziczaca z klasy {@link Ma_katy}
 */
public class Szesciokat extends Ma_katy{
    /**
     * bok szesciokata
     */
    protected int bok_a;
    /**
     * bok szesciokata
     */
    protected int bok_b;
    /**
     * bok szesciokata
     */
    protected int bok_c;
    /**
     * bok szesciokata
     */
    protected int bok_d;
    /**
     * bok szesciokata
     */
    protected int bok_e;
    /**
     * bok szesciokata
     */
    protected int bok_f;

    /**
     *konstruktor klasy szeciokat
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param bok_a {@link Szesciokat#bok_a}
     * @param bok_b {@link Szesciokat#bok_b}
     * @param bok_c {@link Szesciokat#bok_c}
     * @param bok_d {@link Szesciokat#bok_d}
     * @param bok_e {@link Szesciokat#bok_e}
     * @param bok_f {@link Szesciokat#bok_f}
     */
    public Szesciokat(int id, String kolor, String przezroczystosc,int bok_a, int bok_b, int bok_c, int bok_d, int bok_e, int bok_f) {
        super(id, kolor, przezroczystosc, (bok_a + bok_b + bok_c + bok_d + bok_e + bok_f), (int) ((Math.pow(bok_a,2) * 1.732) + (Math.pow(bok_b,2) * 1.732) + (Math.pow(bok_c,2) * 1.732) + (Math.pow(bok_d,2) * 1.732) + (Math.pow(bok_e,2) * 1.732) + (Math.pow(bok_f,2) * 1.732))/4, (6), (720),   (Math.min ((1.732 * bok_a), (Math.min((1.732 * bok_b), (Math.min((1.732 * bok_c), (Math.min((1.732*bok_d), (Math.min((1.732 * bok_c), (1.732 * bok_f))))))))))),  (Math.max ((1.732 * bok_a), (Math.max((1.732 * bok_b), (Math.max((1.732 * bok_c), (Math.max((1.732*bok_d), (Math.max((1.732 * bok_c), (1.732 * bok_f))))))))))), (6));
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
        this.bok_d = bok_d;
        this.bok_e = bok_e;
        this.bok_f = bok_f;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_a}
     */
    public int getBok_a() {
        return bok_a;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_a {@link Szesciokat#bok_a}
     */
    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_a}
     */
    public int getBok_b() {
        return bok_b;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_b {@link Szesciokat#bok_b}
     */
    public void setBok_b(int bok_b) {
        this.bok_b = bok_b;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_c}
     */
    public int getBok_c() {
        return bok_c;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_c {@link Szesciokat#bok_c}
     */
    public void setBok_c(int bok_c) {
        this.bok_c = bok_c;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_d}
     */
    public int getBok_d() {
        return bok_d;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_d {@link Szesciokat#bok_d}
     */
    public void setBok_d(int bok_d) {
        this.bok_d = bok_d;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_e}
     */
    public int getBok_e() {
        return bok_e;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_e {@link Szesciokat#bok_e}
     */
    public void setBok_e(int bok_e) {
        this.bok_e = bok_e;
    }

    /**
     * getter dla boku szesciokata
     * @return {@link Szesciokat#bok_f}
     */
    public int getBok_f() {
        return bok_f;
    }

    /**
     * setter dla boku szesciokata
     * @param bok_f {@link Szesciokat#bok_f}
     */
    public void setBok_f(int bok_f) {
        this.bok_f = bok_f;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s, bok c: %s, bok d: %s, bok e: %s, bok f: %s", this.getBok_a(), this.getBok_b(), this.getBok_c(), this.getBok_d(), this.getBok_e(), this.getBok_f());
    }

}
