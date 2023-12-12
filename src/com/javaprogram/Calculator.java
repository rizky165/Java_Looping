package com.javaprogram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double bil1,bil2,hasil;
        int pilihan;
        System.out.println("Kalkulator Sederhana");
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        System.out.println("======================");

        /*Scanner operasi = new Scanner(System.in);*/

        Scanner Calc = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        bil1 = Calc.nextFloat();

        System.out.print("Masukan Bilangan: ");
        bil2 = Calc.nextFloat();

        System.out.print("Pilih Operasi: ");
        pilihan = Calc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = bil1 + bil2;
                System.out.print("Hasil Penjumlahan berikut adalah " + hasil);
            break;

            case 2:
                hasil = bil1 - bil2;
                System.out.print("Hasil Pengurangan berikut adalah " + hasil);
                break;
            case 3:
                hasil = bil1 * bil2;
                System.out.print("Hasil Perkalian berikut adalah " + hasil);
                break;
            case 4:
                hasil = bil1 / bil2;
                System.out.print("Hasil Pembagian berikut adalah " + hasil);
                break;

            default:
                System.out.println("Operasi tidak valid.");
        }

    }
}
