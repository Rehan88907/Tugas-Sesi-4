/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raihanproject1;

/**
 *
 * @author User
 */
public class BankBCA {
    void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }
    
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank BCA");
    }

    double hitungBiayaTransfer(int jumlah) {
        // Misalkan biaya transfer BCA adalah 1.5% dari jumlah transfer
        return jumlah * 0.015;
    }
}

