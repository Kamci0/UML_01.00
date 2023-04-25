package Package;

public class Okrag extends Figura{
    protected int promien;

    public Okrag(int id, String kolor, String przezroczystosc, int promien) {
        super(id, kolor, przezroczystosc, (int)(2*Math.PI*promien), (int) (Math.PI * Math.pow(promien,2)));
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" promien: %s", this.getPromien());
    }
}
