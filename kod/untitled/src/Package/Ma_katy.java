package Package;

/**
 * klasa Ma_katy dziedziczaca z klasy {@link Figura}
 */
public class Ma_katy extends Figura{
    /**
     * Liczba katow
     */
    protected int libcza_katow;
    /**
     * suma katow
     */
    protected  int suma_katow;
    /**
     * najkrotsza przekatna
     */
    protected double najkrotsza_przekatna;
    /**
     * najdlozsza przekotna
     */
    protected double najdlozsza_przekatna;
    /**
     * liczba wierzcholkow
     */
    protected int liczba_wierzcholkow;

    /**
     *konstruktor klasy Ma_katy
     * @param id {@link Figura#id}
     * @param kolor {@link Figura#kolor}
     * @param przezroczystosc {@link Figura#przezroczystosc}
     * @param obwod {@link Figura#obwod}
     * @param pole_powierzchni {@link Figura#pole_powierzchni}
     * @param libcza_katow {@link Ma_katy#libcza_katow}
     * @param suma_katow {@link Ma_katy#suma_katow}
     * @param najkrotsza_przekatna {@link Ma_katy#najkrotsza_przekatna}
     * @param najdlozsza_przekatna {@link Ma_katy#najdlozsza_przekatna}
     * @param liczba_wierzcholkow {@link Ma_katy#liczba_wierzcholkow}
     */
    public Ma_katy(int id, String kolor, String przezroczystosc, int obwod, int pole_powierzchni, int libcza_katow, int suma_katow, double najkrotsza_przekatna, double najdlozsza_przekatna, int liczba_wierzcholkow) {
        super(id, kolor, przezroczystosc, obwod, pole_powierzchni);
        this.libcza_katow = libcza_katow;
        this.suma_katow = suma_katow;
        this.najkrotsza_przekatna = najkrotsza_przekatna;
        this.najdlozsza_przekatna = najdlozsza_przekatna;
        this.liczba_wierzcholkow = liczba_wierzcholkow;
    }

    /**
     * getter dla liczby katow
     * @return {@link Ma_katy#libcza_katow}
     */
    public int getLibcza_katow() {
        return libcza_katow;
    }

    /**
     * setter dla liczby katow
     * @param libcza_katow {@link Ma_katy#libcza_katow}
     */
    public void setLibcza_katow(int libcza_katow) {
        this.libcza_katow = libcza_katow;
    }

    /**
     * getter dla sumy katow
     * @return {@link Ma_katy#suma_katow}
     */
    public int getSuma_katow() {
        return suma_katow;
    }

    /**
     *  setter dla sumy katow
     * @param suma_katow {@link Ma_katy#suma_katow}
     */
    public void setSuma_katow(int suma_katow) {
        this.suma_katow = suma_katow;
    }

    /**
     * getter dla najkrotszej przekatnej
     * @return {@link Ma_katy#najkrotsza_przekatna}
     */
    public double getNajkrotsza_przekatna() {
        return najkrotsza_przekatna;
    }

    /**
     * setter dla najkrotszej przekatnej
     * @param najkrotsza_przekatna {@link Ma_katy#najkrotsza_przekatna}
     */
    public void setNajkrotsza_przekatna(int najkrotsza_przekatna) {
        this.najkrotsza_przekatna = najkrotsza_przekatna;
    }

    /**
     * getter dla najdluzszej przekatnej
     * @return {@link Ma_katy#najdlozsza_przekatna}
     */
    public double getNajdlozsza_przekatna() {
        return najdlozsza_przekatna;
    }

    /**
     * setter dla najdluzszej przekatnej
     * @param najdlozsza_przekatna {@link Ma_katy#najdlozsza_przekatna}
     */
    public void setNajdlozsza_przekatna(int najdlozsza_przekatna) {
        this.najdlozsza_przekatna = najdlozsza_przekatna;
    }

    /**
     * getter dla liczby wierzcholkow
     * @return {@link Ma_katy#liczba_wierzcholkow}
     */
    public int getLiczba_wierzcholkow() {
        return liczba_wierzcholkow;
    }

    /**
     * setter dla liczby wierzcholkow
     * @param liczba_wierzcholkow {@link Ma_katy#liczba_wierzcholkow}
     */
    public void setLiczba_wierzcholkow(int liczba_wierzcholkow) {
        this.liczba_wierzcholkow = liczba_wierzcholkow;
    }

    /**
     * laczy dane obiektu w jeden napis
     * @return dane obiektu
     */
    @Override
    protected String dane() {
        return super.dane() + String.format(" Liczba katow: %s, suma katow: %s, najkrotsza przekatna: %s, najdluzsza przekatna: %s, liczba wierzcholkow: %s ", this.getLibcza_katow(), this.getSuma_katow(), this.getNajkrotsza_przekatna(), this.getNajdlozsza_przekatna(), this.getLiczba_wierzcholkow());
    }
}
