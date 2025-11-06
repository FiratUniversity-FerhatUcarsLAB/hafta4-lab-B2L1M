/*
 * Ad Soyad: Ozan Diyar AY
 * Ogrenci No: 250541062
 * Tarih: 06.11.2025
 * Aciklama: Gorev 3
 * Bu gorevde kullanicinin girdigi bilgilerle
 * calisanin maas bordrosunu olusturan bir sistem hazirlandi
 */

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======= MAAS HESAPLAYICI =======\n");

        System.out.print("Calisanin Adi Soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik Brut Maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik Calisma Saati: ");
        int calismaSaati = input.nextInt();

        System.out.print("Mesai Saati Sayisi: ");
        int mesaiSaati = input.nextInt();

        System.out.println("\n================================");
        System.out.println("========  MAAS BORDROSU  =======");
        System.out.println("================================");

        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Tarih: " + java.time.LocalDate.now());

        System.out.println("\nGELİRLER:\n");
        
        // Etiketleri sola dayalı 15 karakter genişliğe ayarla (%-15s)
        System.out.printf("%-15s: %.2f TL\n", "Brut Maas", brutMaas);
        
        double mesaiUcreti = (brutMaas / (calismaSaati * 4)) * mesaiSaati * 1.5;
        
        System.out.printf("%-15s: %.2f TL\n", "Mesai Ucreti", mesaiUcreti);
        
        double toplamGelir = brutMaas + mesaiUcreti;
        
        System.out.println("--------------------------------");
        System.out.printf("%-15s: %.2f TL\n", "TOPLAM GELIR", toplamGelir);

        System.out.println("\nKESINTILER:\n");

        double sgk = toplamGelir * 0.14;
        System.out.printf("%-15s: %.2f TL\n", "SGK Kesintisi", sgk);

        double gelirVergisi = toplamGelir * 0.15;
        System.out.printf("%-15s: %.2f TL\n", "Gelir Vergisi", gelirVergisi);

        double damgaVergisi = toplamGelir * 0.008;
        System.out.printf("%-15s: %.2f TL\n", "Damga Vergisi", damgaVergisi);

        System.out.println("--------------------------------");
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
        System.out.printf("%-15s: %.2f TL\n", "TOPLAM KESINTI", toplamKesinti);

        double netMaas = toplamGelir - toplamKesinti;
        System.out.printf("\n%-15s: %.2f TL\n", "NET MAAS", netMaas);

        System.out.println("\nISTATISTIKLER:\n");

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        System.out.printf("%-15s: %.2f%%\n", "Kesinti Orani", kesintiOrani);

        double saatlikKazanc = netMaas / (calismaSaati * 4 + mesaiSaati);
        System.out.printf("%-15s: %.2f TL/saat\n", "Saatlik Kazanc", saatlikKazanc);

        double gunlukKazanc = netMaas / 30;
        System.out.printf("%-15s: %.2f TL/gun\n", "Gunluk Kazanc", gunlukKazanc);

        System.out.println("================================");
    }
    
}
