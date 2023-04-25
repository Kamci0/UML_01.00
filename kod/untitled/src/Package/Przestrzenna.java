package Package;

public class Przestrzenna extends Figura{
    protected int objetosc;

    public Przestrzenna(int id, String kolor, String przezroczystosc, int obwod, int pole_powierzchni, int objetosc) {
        super(id, kolor, przezroczystosc, obwod, pole_powierzchni);
        this.objetosc = objetosc;
    }

    public int getObjetosc() {
        return objetosc;
    }

    public void setObjetosc(int objetosc) {
        this.objetosc = objetosc;
    }

    @Override
    protected String dane() {
        return super.dane() + String.format(" objetosc: %s", this.getObjetosc());
    }
}
