import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        int wiek = 14;
        String miasto = "warszawa";
        String dzien = "poniedziałek";

        int cenaBiletu = 40;
        double znizka = Main.getZnizka(wiek, miasto, dzien);
        double cenaost=cenaBiletu-cenaBiletu*znizka;
        assertEquals (16,cenaost);
    }
}