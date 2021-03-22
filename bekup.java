package com.modul.dua;



import java.util.*;

public class makanan {
    public static void main(String[] args){
        double phi = 3.14;
        double r, keliling, Luas;
        int pilih;

        @SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
        System.out.println("KALKULATOR LINGKARAN");
        System.out.println("1. Menghitung Luas");
        System.out.println("2. Menghitung Keliling");
        System.out.print("Pilih Proses Hitungan : ");
        pilih = x.nextInt();

        switch (pilih){
            case 1:
                System.out.println("\nMenghitung Luas");
                System.out.print("Masukkan jari - jari(cm) :");
                r = x.nextInt();
                Luas = phi*r*r;

                System.out.println("Hasil : "+Luas+ " cm");
                break;


            case 2:
                System.out.println("\nMenghitung Keliling");
                System.out.print("Masukkan jari - jari(cm) :");
                r = x.nextInt();
                keliling = 2*phi*r;

                System.out.println("Hasil : "+keliling+" cm");
                break;

            default:
                System.out.println("Proses hitung tidak ditemukan, program dihentikan.");
        }
    }
}
