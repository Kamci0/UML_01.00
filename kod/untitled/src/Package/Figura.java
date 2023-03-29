package Package;

public class Figura {
    protected int id;
    protected  String kolor;
    protected String przezroczystosc;
    protected int obwod;
    protected int pole_powierzchni;
    protected int promien_katow;
    protected int zajmowana_przestrzen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getPrzezroczystosc() {
        return przezroczystosc;
    }

    public void setPrzezroczystosc(String przezroczystosc) {
        this.przezroczystosc = przezroczystosc;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public int getPole_powierzchni() {
        return pole_powierzchni;
    }

    public void setPole_powierzchni(int pole_powierzchni) {
        this.pole_powierzchni = pole_powierzchni;
    }

    public int getPromien_katow() {
        return promien_katow;
    }

    public void setPromien_katow(int promien_katow) {
        this.promien_katow = promien_katow;
    }

    public int getZajmowana_przestrzen() {
        return zajmowana_przestrzen;
    }

    public void setZajmowana_przestrzen(int zajmowana_przestrzen) {
        this.zajmowana_przestrzen = zajmowana_przestrzen;
    }

    protected String dane(){
        return String.format("id: %s, obwod: %s, Pole powierzchni: %s, Promien kątów: %s, kolor: %s, przeźroczystość: %s, zajmowana przestrzeń: %s", this.getId(), this.getObwod(), this.getPole_powierzchni(), this.getPromien_katow(), this.getKolor(), this.getPrzezroczystosc(), this.getZajmowana_przestrzen());
    }
}
