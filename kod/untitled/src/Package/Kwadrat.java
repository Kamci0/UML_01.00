package Package;

/**
 * klasa Kwadrat dziedziczaca z klasy {@link Ma_katy}
 */
public class Kwadrat extends Ma_katy{
    /**
     * bok kwadratu
     */
    protected int bok_a;

    /**
     *konstruktor klasy kwadrat
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param bok_a {@link Kwadrat#bok_a}
     */
    public Kwadrat(int id, String kolor, String przezroczystosc, int bok_a) {
        super(id, kolor, przezroczystosc, (bok_a*4), (bok_a * bok_a), (4), (360), (bok_a * 1.4), (bok_a * 1.4), (4));
        this.bok_a = bok_a;
    }

    /**
     * getter boku kwadratu
     * @return {@link Kwadrat#bok_a}
     */
    public int getBok_a() {
        return bok_a;
    }

    /**
     * setter boku kwadratu
     * @param bok_a {@link Kwadrat#bok_a}
     */
    public void setBok_a(int bok_a) {
        this.bok_a = bok_a;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" bok a: %s", this.getBok_a());
    }
}
