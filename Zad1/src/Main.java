import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wiek: ");
        int wiek = scanner.nextInt();

        System.out.println("miasto: ");
        String miasto = scanner.next().toLowerCase();

        System.out.println("dzień tygodnia: ");
        String dzien = scanner.next().toLowerCase();

        int cenaBiletu = 40;
        int znizka = getZnizka(wiek, miasto, dzien);

        System.out.println("Dane: "+miasto+", "+wiek+", "+dzien);
        System.out.println("Cena biletu:"+((znizka/100.0)*cenaBiletu)+"zł");
        System.out.println(znizka+"%");
    }

    private static int getZnizka(int wiek, String miasto, String dzien) {
        int znizka = 0;

        if(wiek <18 && wiek >10){
            znizka += 50;
        }else if(wiek <10){
            znizka = 100;
        }

        if(miasto.equals("warszawa")){
            znizka +=10;
        }

        if (dzien.equals("czwartek")){
            znizka = 100;
        }
        if(znizka>100){znizka=100;}

        System.out.println(znizka);
        return Math.abs(znizka-100);




    }
}