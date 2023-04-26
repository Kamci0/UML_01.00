package Package;


/**
 * klasa Graniastoslup dziedziczaca z klasy {@link Przestrzenna}
 */
public class Graniasioslup extends Przestrzenna{
    /**
     * krawedz graniastosplupa
     */
    protected int krawedz_a;
    /**
     * krawedz graniastosplupa
     */
    protected int krawedz_b;

    /**
     *konstruktor dla Graniastoslupa
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param krawedz_a {@link Graniasioslup#krawedz_a}
     * @param krawedz_b {@link Graniasioslup#krawedz_b}
     */
    public Graniasioslup(int id, String kolor, String przezroczystosc,int krawedz_a, int krawedz_b) {
        super(id, kolor, przezroczystosc, ((krawedz_a * 4) + (krawedz_b*4)), (((krawedz_a*krawedz_b)*6)), (krawedz_a * krawedz_a * krawedz_b));
        this.krawedz_a = krawedz_a;
        this.krawedz_b = krawedz_b;
    }

    /**
     * getter dla krawedzi
     * @return {@link Graniasioslup#krawedz_a}
     */
    public int getKrawedz_a() {
        return krawedz_a;
    }

    /**
     * setter dla krawedzi
     * @param krawedz_a {@link Graniasioslup#krawedz_a}
     */
    public void setKrawedz_a(int krawedz_a) {
        this.krawedz_a = krawedz_a;
    }

    /**
     * getter dla krawedzi
     * @return {@link Graniasioslup#krawedz_b}
     */
    public int getKrawedz_b() {
        return krawedz_b;
    }

    /**
     * setter dla krawedzi
     * @param krawedz_b {@link Graniasioslup#krawedz_b}
     */
    public void setKrawedz_b(int krawedz_b) {
        this.krawedz_b = krawedz_b;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" krawedz a: %s, krawedz b: %s", this.getKrawedz_a(), this.getKrawedz_b());
    }
}
