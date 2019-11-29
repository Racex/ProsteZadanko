public class Main {

    public static void main(String[] args) {
        // Proste zadanie sprawdzające 80 stron :D

        Kalkulator kalkulator = new Kalkulator();

        kalkulator.dodaj(2,3);
        kalkulator.pokazWynik();

        kalkulator.odejmij(5,1);
        kalkulator.pokazWynik();

        kalkulator.pomnoz(2,3);
        kalkulator.pokazWynik();

        kalkulator.podziel(123,2);
        kalkulator.pokazWynik();

        kalkulator.pierwiastekKwadratowy(4);
        kalkulator.pokazWynik();

        kalkulator.wartośćBezWzgledna(3,5);
        kalkulator.pokazWynik();

        kalkulator.coJestWiększe(123,545);
    }
}
