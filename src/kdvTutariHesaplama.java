import java.util.Scanner;

public class kdvTutariHesaplama {
    public static void main(String[] args) {
    double tutar, kdvOrani =0.18, kdvliFiyat , kdvTutari ;
    Scanner scan = new Scanner(System.in);
    System.out.print("Para Degerini Giriniz : ");
    tutar = scan.nextDouble();
    kdvTutari = tutar*kdvOrani;
    kdvliFiyat = tutar+(tutar*kdvOrani);
    System.out.println("Kdvsiz Tutar "+tutar);
    System.out.println("Kdv Oranı "+kdvOrani);
    System.out.println("Kdv Tutarı "+kdvTutari);
    System.out.println("Kdvli Fiyatı "+kdvliFiyat);


    }
}
