package Package;

/**
 * klasa Okrag dziedziczaca z klasy {@link Figura}
 */
public class Okrag extends Figura{
    /**
     * promien okregu
     */
    protected int promien;

    /**
     *konstruktor klasy Okrag
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param promien {@link Okrag#promien}
     */
    public Okrag(int id, String kolor, String przezroczystosc, int promien) {
        super(id, kolor, przezroczystosc, (int)(2*Math.PI*promien), (int) (Math.PI * Math.pow(promien,2)));
        this.promien = promien;
    }

    /**
     * getter dla promienia
     * @return {@link Okrag#promien}
     */
    public int getPromien() {
        return promien;
    }

    /**
     * setter dla promienia
     * @param promien {@link Okrag#promien}
     */
    public void setPromien(int promien) {
        this.promien = promien;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" promien: %s", this.getPromien());
    }
}
