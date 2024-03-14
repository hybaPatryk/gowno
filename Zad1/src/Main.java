
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        int wiek = getWiek();

        String miasto = getMiasto();

        String dzien  = getDzien();

        int cenaBiletu = 40;
        double znizka = getZnizka(wiek, miasto, dzien);

        System.out.println("Dane: "+wiek+", "+miasto+", "+dzien);
        System.out.println("Cena biletu:"+(cenaBiletu-znizka*cenaBiletu)+"zł");
        System.out.println(znizka*100+"%");
    }

    public static double getZnizka(int wiek, String miasto, String dzien) {
        double znizka = 0;

        if(wiek <10 || dzien.equals("czwartek")){
            znizka = 1;
        }
        if(wiek <18 && wiek >10){
            znizka += 0.5;
        }
        if(miasto.equals("warszawa")){
            znizka +=0.1;
        }
        return znizka;
    }

    public static int getWiek() throws Exception{
        int wiek;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("wiek: ");
            wiek = scanner.nextInt();
        }catch (Exception exc){
            throw new Exception("Nieprawidłowy wiek");
        }

        if(wiek<1 || wiek>150){
            throw new Exception("Wiek musi być z zakresu 1 i 150");
        }

        return wiek;
    }

    public static String getMiasto() throws Exception{
        String miasto;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("miasto: ");
            miasto = scanner.next().toLowerCase();
        }catch (Exception exc){
            throw new Exception("Niepoprawne miasto");
        }
        return miasto;
    }

    public static String getDzien() throws Exception{

            HashSet<String> dniTyg=new HashSet<>();
            dniTyg.add("poniedziałek");
            dniTyg.add("wtorek");
            dniTyg.add("środa");
            dniTyg.add("czwartek");
            dniTyg.add("piątek");
            dniTyg.add("sobota");
            dniTyg.add("niedziela");

            String dzien;
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.print("dzień:");
                dzien = scanner.nextLine();
                dzien=dzien.trim();
                dzien=dzien.toLowerCase();
            }catch (Exception exc){
                throw new Exception("Niepoprawny dzień tygodnia");
            }
            if(!dniTyg.contains(dzien)){
                throw new Exception("Niepoprawny dzień tygodnia");
            }
            return dzien;
        }

}
