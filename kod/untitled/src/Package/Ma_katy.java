package Package;

public class Ma_katy extends Figura{
    protected int libcza_katow;
    protected  int suma_katow;
    protected double najkrotsza_przekatna;
    protected double najdlozsza_przekatna;
    protected int liczba_wierzcholkow;

    public Ma_katy(int id, String kolor, String przezroczystosc, int obwod, int pole_powierzchni, int libcza_katow, int suma_katow, double najkrotsza_przekatna, double najdlozsza_przekatna, int liczba_wierzcholkow) {
        super(id, kolor, przezroczystosc, obwod, pole_powierzchni);
        this.libcza_katow = libcza_katow;
        this.suma_katow = suma_katow;
        this.najkrotsza_przekatna = najkrotsza_przekatna;
        this.najdlozsza_przekatna = najdlozsza_przekatna;
        this.liczba_wierzcholkow = liczba_wierzcholkow;
    }

    public int getLibcza_katow() {
        return libcza_katow;
    }

    public void setLibcza_katow(int libcza_katow) {
        this.libcza_katow = libcza_katow;
    }

    public int getSuma_katow() {
        return suma_katow;
    }

    public void setSuma_katow(int suma_katow) {
        this.suma_katow = suma_katow;
    }

    public double getNajkrotsza_przekatna() {
        return najkrotsza_przekatna;
    }

    public void setNajkrotsza_przekatna(int najkrotsza_przekatna) {
        this.najkrotsza_przekatna = najkrotsza_przekatna;
    }

    public double getNajdlozsza_przekatna() {
        return najdlozsza_przekatna;
    }

    public void setNajdlozsza_przekatna(int najdlozsza_przekatna) {
        this.najdlozsza_przekatna = najdlozsza_przekatna;
    }

    public int getLiczba_wierzcholkow() {
        return liczba_wierzcholkow;
    }

    public void setLiczba_wierzcholkow(int liczba_wierzcholkow) {
        this.liczba_wierzcholkow = liczba_wierzcholkow;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" Liczba katow: %s, suma katow: %s, najkrotsza przekatna: %s, najdluzsza przekatna: %s, liczba wierzcholkow: %s ", this.getLibcza_katow(), this.getSuma_katow(), this.getNajkrotsza_przekatna(), this.getNajdlozsza_przekatna(), this.getLiczba_wierzcholkow());
    }
}
