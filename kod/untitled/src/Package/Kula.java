package Package;

/**
 * klasa Kula dziedziczaca z klasy {@link Przestrzenna}
 */
public class Kula extends Przestrzenna{
    /**
     * promien kuli
     */
    protected int promien;

    /**
     *konstruktor plasu kula
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param promien {@link Kula#promien}
     */
    public Kula(int id, String kolor, String przezroczystosc,int promien) {
        super(id, kolor, przezroczystosc, (0), (int)(4* Math.PI * Math.pow(promien,2)), (int)((4*Math.PI * Math.pow(promien,3))/3));
        this.promien = promien;
    }

    /**
     * getter dla promienia
     * @return {@link Kula#promien}
     */
    public int getPromien() {
        return promien;
    }

    /**
     * setter dla promienia
     * @param promien {@link Kula#promien}
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
        return super.dane()+ String.format(" promien: %s", this.getPromien());
    }
}
