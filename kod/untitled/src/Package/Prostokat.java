package Package;

/**
 * klasa Prostokat dziedziczaca z klasy {@link Ma_katy}
 */
public class Prostokat extends  Ma_katy{
    /**
     * bok prostokata
     */
    protected int bok_a;
    /**
     * bok prostokata
     */
    protected int bok_b;

    /**
     *konstruktor klasy prostokat
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param bok_a {@link Prostokat#bok_a}
     * @param bok_b {@link Prostokat#bok_a}
     */
    public Prostokat(int id, String kolor, String przezroczystosc, int bok_a, int bok_b) {
        super(id, kolor, przezroczystosc, ((2*bok_a) + (2*bok_b)), (bok_a*bok_b), (4), (360), (Math.sqrt((Math.pow(bok_a,2)+ Math.pow(bok_b,2)))), (Math.sqrt((Math.pow(bok_a,2)+ Math.pow(bok_b,2)))), (4));
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }

    /**
     * getter dla boku prostokata
     * @return {@link Prostokat#bok_a}
     */
    public int getBok_a() {
        return bok_a;
    }

    /**
     * setter dla boku prostokata
     * @param bok_a {@link Prostokat#bok_a}
     */
    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    /**
     * getter dla boku prostokata
     * @return {@link Prostokat#bok_b}
     */
    public int getBok_b() {
        return bok_b;
    }

    /**
     * setter dla boku prostokata
     * @param bok_b {@link Prostokat#bok_b}
     */
    public void setBok_b(int bok_b) {
        this.bok_b = bok_b;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s", this.getBok_a(), this.getBok_b());
    }
}
