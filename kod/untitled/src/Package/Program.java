package Package;

/**
 * klasa Program zawierajaca metode main
 */
public class Program {
    /**
     * metoda main
     */
    public static void main(String[] args) {
        Figura[] figury = {
                new Kula(0, "czarny", "nie" , 12),
                new Prostopadloscian(1, "niebieski", "tak" ,6,9,2) ,
                new Graniasioslup(2, "bialy", "nie", 2,5),
                new Szescian(3, "#F00", "nie", 9),
                new Stozek(4, "czerwony", "tak", 2, 9),
                new Okrag(5, "zielony", "tak", 2),
                new Trojkat(6,"bialy", "tak", 5,3,5,6),
                new Kwadrat(7,"#FF00FF", "nie", 23),
                new Prostokat(8, "rozowy", "tak", 3,9),
                new Pieciokat(9,"#969", "nie", 6,7,3,2,90),
                new Szesciokat(10,"szary", "nie", 2,5,12,65,12,234)
        };

        for(Figura f : figury){
            System.out.println(f.dane());
        }
    }
}
