/*
 * Ad Soyad: Ozan Diyar AY
 * Ogrenci No: 250541062
 * Tarih: 06.11.2025
 * Aciklama: Gorev 2
 * Bu gorevde sisteme girilen yaricap bilgisine
 * gore bir daire ve bir kurenin hesaplamalarini yapan
 * bir sistem hazirlandi
 */

import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        
        System.out.print("Dairenin yaricapini girin: ");
        double yaricap = input.nextDouble();

        final double pi = 3.1415;

        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;
        double kureHacmi = 4.0/3.0 * pi * yaricap * yaricap * yaricap;
        double kureYuzeyAlani = 4 * pi * yaricap * yaricap;

        System.out.println("\n=== SONUCLAR ===");

        System.out.printf("Dairenin Alani: %.2f\n", alan, "cm^2");
        System.out.printf("Dairenin Cevresi: %.2f\n", cevre, "cm");
        System.out.printf("Kurenin Hacmi: %.2f\n", kureHacmi, "cm^3");
        System.out.printf("Kurenin Yuzey Alani: %.2f\n", kureYuzeyAlani, "cm^2");

        
    }
}

