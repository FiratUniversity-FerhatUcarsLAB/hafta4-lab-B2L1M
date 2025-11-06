/*
 * Ad Soyad: Ozan Diyar AY
 * Ogrenci No: 250541062
 * Tarih: 06.11.2025
 * Aciklama: Gorev 1
 * Bu program kullanicidan aldigi bilgileri ekrana
 * duzenli bir sekilde yazdirarak bir ogrenci
 * bilgi sistemi olusturur.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci numaranızı giriniz: ");
        int ogrenci_no = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0,00 - 4,00): ");
        float gpa = input.nextFloat();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===\n");
        System.out.printf("Ad Soyad: %s %s", ad, soyad);
        System.out.printf("\nOgrenci No: %d", ogrenci_no);
        System.out.printf("\nYas: %d", yas);
        System.out.printf("\nGPA: %.2f", gpa);


    }
}
