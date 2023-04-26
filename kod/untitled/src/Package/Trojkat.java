package Package;

/**
 * klasa Trojkat dziedziczaca z klasy {@link Ma_katy}
 */
public class Trojkat extends Ma_katy{
    /**
     * wysokosc trojkata
     */
    protected int wysokosc;
    /**
     * bok trojkata
     */
    protected int bok_a;
    /**
     * bok trojkata
     */
    protected int bok_b;
    /**
     * bok trojkata
     */
    protected int bok_c;

    /**
     *konstruktor klasy trojkat
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param wysokosc {@link Trojkat#wysokosc}
     * @param bok_a {@link Trojkat#bok_a}
     * @param bok_b {@link Trojkat#bok_b}
     * @param bok_c {@link Trojkat#bok_c}
     */
    public Trojkat(int id, String kolor, String przezroczystosc, int wysokosc, int bok_a, int bok_b, int bok_c) {
        super(id, kolor, przezroczystosc, (bok_a + bok_b + bok_c), ((bok_a * wysokosc) / 2), (3), (180), (0), (0), (3));
        this.wysokosc = wysokosc;
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
    }

    /**
     * getter dla wysokosci
     * @return {@link Trojkat#wysokosc}
     */
    public int getWysokosc() {
        return wysokosc;
    }

    /**
     * setter dla wysokosci
     * @param wysokosc {@link Trojkat#wysokosc}
     */
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    /**
     * getter dla boku
     * @return {@link Trojkat#bok_a}
     */
    public int getBok_a() {
        return bok_a;
    }

    /**
     * setter dla boku
     * @param bok_a {@link Trojkat#bok_a}
     */
    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    /**
     * getter dla boku
     * @return {@link Trojkat#bok_b}
     */
    public int getBok_b() {
        return bok_b;
    }

    /**
     * setter dla boku
     * @param bok_b {@link Trojkat#bok_b}
     */
    public void setBok_b(int bok_b) {
        this.bok_b = bok_b;
    }

    /**
     * getter dla boku
     * @return {@link Trojkat#bok_c}
     */
    public int getBok_c() {
        return bok_c;
    }

    /**
     * setter dla boku
     * @param bok_c {@link Trojkat#bok_c}
     */
    public void setBok_c(int bok_c) {
        this.bok_c = bok_c;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s, bok b: %s, bok c: %s, wysokosc: %s", this.getBok_a(), this.getBok_b(), this.getBok_c(), this.getWysokosc());
    }
}
