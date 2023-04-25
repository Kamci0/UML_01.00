package Package;

public class Stozek extends Przestrzenna{
    protected int promien;
    protected int wysokosc;

    public Stozek(int id, String kolor, String przezroczystosc,int promien, int wysokosc) {
        super(id, kolor, przezroczystosc, (int)(2*Math.PI * promien), (int) (Math.PI * promien * (Math.sqrt((Math.pow(promien, 2) + Math.pow(wysokosc,2))))), (int)((Math.PI * Math.pow(promien, 2) * wysokosc))/3);
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" promien: %s, wysokosc: %s", this.getPromien(), this.getWysokosc());
    }
}
