package com.modul.dua;



import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args){
	int pilih;
        double phi = 3.14, r, keliling, Luas;
      
        @SuppressWarnings("resource")
	Scanner pb = new Scanner(System.in);
        System.out.println("Luas lingkaran");
        System.out.println("1. Menghitung Luas");
        System.out.println("2. Menghitung Keliling");
        System.out.print("Pilih Proses Hitungan : ");
        pilih = pb.nextInt();

        switch (pilih){
            case 1:
                System.out.println("\nMenghitung Luas");
                System.out.print("Masukkan jari - jari :");
                r = pb.nextInt();
                Luas = phi*r*r;
                System.out.println("Hasil : "+Luas);
                break;
            case 2:
                System.out.println("\nMenghitung Keliling");
                System.out.print("Masukkan jari - jari :");
                r = pb.nextInt();
                keliling = 2*phi*r;
                System.out.println("Hasil : "+keliling);
                break;

            default:
                System.out.println("inputan salah");
        }
    }
}
