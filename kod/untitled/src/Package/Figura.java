package Package;

/**
 * Klasa bazowa Figura
 */
public class Figura {
    /**
     * id figury
     */
    protected int id;
    /**
     * kolor figury
     */
    protected  String kolor;
    /**
     * przezroczystosc figury
     */
    protected String przezroczystosc;
    /**
     * obwod figury
     */
    protected int obwod;
    /**
     * pole powierzchni firgury
     */
    protected int pole_powierzchni;
    /**
     * przestrzen zajmowana przez figure
     */
    protected int zajmowana_przestrzen;

    /**
     * konstruktor klasy figura
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param obwod {@link Figura#obwod}
     * @param pole_powierzchni {@link Figura#pole_powierzchni}
     */
    public Figura(int id, String kolor, String przezroczystosc, int obwod, int pole_powierzchni) {
        this.id = id;
        this.kolor = kolor;
        this.przezroczystosc = przezroczystosc;
        this.obwod = obwod;
        this.pole_powierzchni = pole_powierzchni;
        this.zajmowana_przestrzen = pole_powierzchni;
    }

    /**
     * getter dla id
     * @return {@link Figura#id}
     */
    public int getId() {
        return id;
    }

    /**
     * setter dla id
     * @param id {@link Figura#id}
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter dla koloru
     * @return {@link Figura#kolor}
     */
    public String getKolor() {
        return kolor;
    }

    /**
     * setter dla koloru
     * @param kolor {@link Figura#kolor}
     */
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    /**
     * getter dla Przezroczystosci
     * @return {@link Figura#przezroczystosc}
     */
    public String getPrzezroczystosc() {
        return przezroczystosc;
    }

    /**
     * setter dla Przezroczystosci
     * @param przezroczystosc {@link Figura#przezroczystosc}
     */
    public void setPrzezroczystosc(String przezroczystosc) {
        this.przezroczystosc = przezroczystosc;
    }

    /**
     * getter dla obwodu
     * @return {@link Figura#obwod}
     */
    public int getObwod() {
        return obwod;
    }

    /**
     * setter dla obwodu
     * @param obwod {@link Figura#obwod}
     */
    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    /**
     * getter dla pola
     * @return {@link Figura#pole_powierzchni}
     */
    public int getPole_powierzchni() {
        return pole_powierzchni;
    }

    /**
     * setter dla pola
     * @param pole_powierzchni {@link Figura#pole_powierzchni}
     */
    public void setPole_powierzchni(int pole_powierzchni) {
        this.pole_powierzchni = pole_powierzchni;
    }

    /**
     * getter  dla zajmowanej przestrzeni
     * @return {@link Figura#pole_powierzchni}
     */
    public int getZajmowana_przestrzen() {
        return zajmowana_przestrzen;
    }

    /**
     * setter dla zajmowanej przestrzeni
     * @param zajmowana_przestrzen {@link Figura#pole_powierzchni}
     */
    public void setZajmowana_przestrzen(int zajmowana_przestrzen) {
        this.zajmowana_przestrzen = zajmowana_przestrzen;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    protected String dane(){
        return String.format("id: %s, obwod: %s, Pole powierzchni: %s, kolor: %s, przezroczysty: %s, zajmowana przestrzen: %s", this.getId(), this.getObwod(), this.getPole_powierzchni(), this.getKolor(), this.getPrzezroczystosc(), this.getZajmowana_przestrzen());
    }
}
