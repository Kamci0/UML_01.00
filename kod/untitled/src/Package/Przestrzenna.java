package Package;

/**
 * klasa Przestrzenna dziedziczaca z klasy {@link Figura}
 */
public class Przestrzenna extends Figura{
    /**
     * objetosc figury przestrzennej
     */
    protected int objetosc;

    /**
     * konstruktor klasy przestrzenna
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param obwod {@link Figura#obwod}
     * @param pole_powierzchni {@link Figura#pole_powierzchni}
     * @param objetosc {@link Przestrzenna#objetosc}
     */
    public Przestrzenna(int id, String kolor, String przezroczystosc, int obwod, int pole_powierzchni, int objetosc) {
        super(id, kolor, przezroczystosc, obwod, pole_powierzchni);
        this.objetosc = objetosc;
    }

    /**
     * getter dla objetosci
     * @return {@link Przestrzenna#objetosc}
     */
    public int getObjetosc() {
        return objetosc;
    }

    /**
     * setter dla objetosci
     * @param objetosc {@link Przestrzenna#objetosc}
     */
    public void setObjetosc(int objetosc) {
        this.objetosc = objetosc;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" objetosc: %s", this.getObjetosc());
    }
}
