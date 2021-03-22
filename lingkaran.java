package com.modul.dua;

import java.util.*;
public class lingkaran {

	public static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double phi = 3.14;
		double r, luas,keliling;
		
		input = new Scanner (System.in);
		
		System.out.println("Program Luas Lingkaran\n");
		System.out.print("Masukkan Panjang Jari-jari : ");
		r = input.nextDouble();

		luas = 0.5 * phi * r * r;
		keliling = 2 * phi * r;

		System.out.print("Luas Lingkaran = " + (int)luas + " \nKeliling lingkaran = "+ (int)keliling);
	}

}
