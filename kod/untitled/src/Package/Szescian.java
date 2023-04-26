package Package;

/**
 * klasa Szescian dziedziczaca z klasy {@link Przestrzenna}
 */
public class Szescian extends Przestrzenna{
    /**
     * krawedz szescianu
     */
    protected int krawedz_a;

    /**
     *konstruktor klasy szescian
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param krawedz_a {@link Szescian#krawedz_a}
     */
    public Szescian(int id, String kolor, String przezroczystosc,int krawedz_a) {
        super(id, kolor, przezroczystosc, (krawedz_a*6), (int)(6 * Math.pow(krawedz_a,2)), (int)(Math.pow(krawedz_a, 3)));
        this.krawedz_a = krawedz_a;
    }

    /**
     * getter dla krawedzi
     * @return {@link Szescian#krawedz_a}
     */
    public int getKrawedz_a() {
        return krawedz_a;
    }

    /**
     * setter dla krawedzi
     * @param krawedz_a {@link Szescian#krawedz_a}
     */
    public void setKrawedz_a(int krawedz_a) {
        this.krawedz_a = krawedz_a;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" krawedz a: %s", this.getKrawedz_a());
    }
}
