package Package;

/**
 * klasa Prostopadloscian dziedziczaca z klasy {@link Przestrzenna}
 */
public class Prostopadloscian extends Przestrzenna{
    /**
     * krawedz prostopadloscianu
     */
    protected int krawedz_a;
    /**
     * krawedz prostopadloscianu
     */
    protected int krawedz_b;
    /**
     * krawedz prostopadloscianu
     */
    protected int krawedz_c;

    /**
     *konstruktor klasy Prostopadloscian
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param krawedz_a {@link Prostopadloscian#krawedz_a}
     * @param krawedz_b {@link Prostopadloscian#krawedz_a}
     * @param krawedz_c {@link Prostopadloscian#krawedz_a}
     */
    public Prostopadloscian(int id, String kolor, String przezroczystosc, int krawedz_a, int krawedz_b, int krawedz_c) {
        super(id, kolor, przezroczystosc, ((krawedz_a*2) + (krawedz_b*2) + (krawedz_c *2)), (((krawedz_a*krawedz_b)*2)+ ((krawedz_a*krawedz_c)*2) + ((krawedz_c*krawedz_b)*2)), (krawedz_a * krawedz_b * krawedz_c));
        this.krawedz_a = krawedz_a;
        this.krawedz_b = krawedz_b;
        this.krawedz_c = krawedz_c;
    }

    /**
     * getter dla krawedzi prostopadloscianu
     * @return {@link Prostopadloscian#krawedz_a}
     */
    public int getKrawedz_a() {
        return krawedz_a;
    }

    /**
     * setter dla krawedzi prostopadlosccianu
     * @param krawedz_a {@link Prostopadloscian#krawedz_a}
     */
    public void setKrawedz_a(int krawedz_a) {
        this.krawedz_a = krawedz_a;
    }

    /**
     * getter dla krawedzi prostopadloscianu
     * @return {@link Prostopadloscian#krawedz_b}
     */
    public int getKrawedz_b() {
        return krawedz_b;
    }

    /**
     * setter dla krawedzi prostopadlosccianu
     * @param krawedz_b {@link Prostopadloscian#krawedz_b}
     */
    public void setKrawedz_b(int krawedz_b) {
        this.krawedz_b = krawedz_b;
    }

    /**
     * getter dla krawedzi prostopadloscianu
     * @return {@link Prostopadloscian#krawedz_c}
     */
    public int getKrawedz_c() {
        return krawedz_c;
    }

    /**
     * setter dla krawedzi prostopadlosccianu
     * @param krawedz_c {@link Prostopadloscian#krawedz_c}
     */
    public void setKrawedz_c(int krawedz_c) {
        this.krawedz_c = krawedz_c;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" krawedz a: %s, krawedz b: %s, krawedz c: %s", this.getKrawedz_a(), this.getKrawedz_b(), this.getKrawedz_c());
    }
}
