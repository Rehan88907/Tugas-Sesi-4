/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raihanproject1;

/**
 *
 * @author User
 */
public class Main {
     public static void main(String[] args) {
        Bank bankUmum = new Bank();
        BankBNI bankBNI = new BankBNI();
        BankBCA bankBCA = new BankBCA();

        // Pengujian method overloading
        System.out.println("\n=== Pengujian Method Overloading ===");
        bankUmum.transferUang(500000, "672345689");
        bankUmum.transferUang(750000, "1902890938", "Mandiri");
        bankUmum.transferUang(1000000, "222444113", "BRI", "Pembayaran tagihan");

        // Pengujian method overriding
        System.out.println("\n=== Pengujian Method Overriding ===");
        bankBNI.sukuBunga();
        bankBCA.sukuBunga();

        // Pengujian overriding transfer
        System.out.println("\n=== Pengujian Transfer dengan Overriding ===");
        bankBNI.transferUang(550000, "109088976", "BNI");
        bankBCA.transferUang(750000, "339028987", "BCA");

        // Menghitung biaya transfer
        System.out.println("\n=== Menghitung Biaya Transfer ===");
        double biayaBNI = bankBNI.hitungBiayaTransfer(550000);
        System.out.println("Biaya transfer BNI: " + biayaBNI);
        
        double biayaBCA = bankBCA.hitungBiayaTransfer(750000);
        System.out.println("Biaya transfer BCA: " + biayaBCA);
    }
}

