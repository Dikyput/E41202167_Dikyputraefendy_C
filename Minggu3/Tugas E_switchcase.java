/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_e;

import java.util.Scanner;
//memasukan paket paket yang dibutuhkan untuk
//menjalankan fungsi fungsinya di program
/**
 *
 * @author DIKYPUT PC
 */
public class switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};
    //String diatas membuat kumpulan menu
        String customer;
        //membuat tipe data string customer
        int pilihan;
        Scanner scan = new Scanner(System.in);
        //menjalankan fungsi paket scanner yang telah di import
        System.out.println("---------------------");
        System.out.println("     CAFE CERIA      ");
        System.out.println("    ANEKA MINUMAN    ");
        System.out.println("---------------------");
        System.out.println("    SPECIAL MENU :   ");
        //mectak output text atau karakter
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println("   " + (i + 1) + ". " + menu[i]);
        }
        //membuat for lopping pada variabel menu
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Masukkan nama pembeli : ");
        //mectak output text atau karakter
        customer = scan.nextLine();
        //meminta memasukan dan melakukan scan pada variabel customer
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();
        //mectak output text atau karakter

        switch (pilihan) {
            //membuat sebuah kasus
            case 1:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah " + menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih "+ customer + " telah berkunjung di Cafe Ceria");
                break;
            default:
                System.out.println("Masukkan pilihan berupa nomor pada menu!");
                System.out.println("Harap pilih kembali !");
                break;
                //memncetak variabel pilihan case case yang sudah ditentukan telah terpenuhi
        }
    
    }
}
