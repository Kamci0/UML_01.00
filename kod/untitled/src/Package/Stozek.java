package Package;

/**
 * klasa Stozek dziedziczaca z klasy {@link Przestrzenna}
 */
public class Stozek extends Przestrzenna{
    /**
     * promien podstawy stozka
     */
    protected int promien;
    /**
     * wysokosc stozka
     */
    protected int wysokosc;

    /**
     *konstruktor klasy Stozek
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param promien {@link Stozek#promien}
     * @param wysokosc {@link Stozek#wysokosc}
     */
    public Stozek(int id, String kolor, String przezroczystosc,int promien, int wysokosc) {
        super(id, kolor, przezroczystosc, (int)(2*Math.PI * promien), (int) (Math.PI * promien * (Math.sqrt((Math.pow(promien, 2) + Math.pow(wysokosc,2))))), (int)((Math.PI * Math.pow(promien, 2) * wysokosc))/3);
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    /**
     * getter dla promienia sotzka
     * @return {@link Stozek#promien}
     */
    public int getPromien() {
        return promien;
    }

    /**
     * setter dla promienia stozka
     * @param promien {@link Stozek#promien}
     */
    public void setPromien(int promien) {
        this.promien = promien;
    }

    /**
     * getter dla wysokosci stozka
     * @return {@link Stozek#wysokosc}
     */
    public int getWysokosc() {
        return wysokosc;
    }

    /**
     * setter dla wysokosci stozka
     * @param wysokosc {@link Stozek#wysokosc}
     */
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" promien: %s, wysokosc: %s", this.getPromien(), this.getWysokosc());
    }
}
