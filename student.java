import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ogrenciler = true;
        int matematik, fizik, kimya;
        String ad, soyad;
        while (ogrenciler) {
            System.out.print("adinizi giriniz:");
            ad = input.next();
            System.out.print("soyadiniz:");
            soyad = input.next();
            System.out.print(" matematik notunu giriniz: ");
            matematik = input.nextInt();
            System.out.print("fizik notunuzu giriniz: ");
            fizik = input.nextInt();
            System.out.print("kimya notunuzu giriniz: ");
            kimya = input.nextInt();
            int toplam = (matematik + fizik + kimya);
            double sonuc = toplam / 3;
            System.out.println("ortalamaniz:" + sonuc);
        }
    }
}