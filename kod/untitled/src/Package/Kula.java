package Package;

public class Kula extends Przestrzenna{
    protected int promien;

    public Kula(int id, String kolor, String przezroczystosc,int promien) {
        super(id, kolor, przezroczystosc, (0), (int)(4* Math.PI * Math.pow(promien,2)), (int)((4*Math.PI * Math.pow(promien,3))/3));
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
        return super.dane()+ String.format(" promien: %s", this.getPromien());
    }
}
