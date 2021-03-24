/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_d;

import java.util.Scanner;
//memasukan paket paket yang dibutuhkan untuk
//menjalankan fungsi fungsinya di program
/**
 *
 * @author DIKYPUT PC
 */
public class sintaks {

  
    public static void main(String[] args) {
    String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};
    //String diatas membuat kumpulan menu
        String customer;
        //membuat tipe data string customer
        Scanner scan = new Scanner(System.in);
        int[] barang = new int[5];
        int harga= 0;
        int total= 0;
        //membuat variabel array 1D integer harga dan total 

        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza ( KAP )        ");
        System.out.println("          Promo Belanja Berhadiah           ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama      ");
        System.out.println("     Dengan harga minimum Rp. 10000,00      ");
        System.out.println("--------------------------------------------");
        //mencetak output karakter
        System.out.print("Masukkan nama pembeli : ");
        customer = scan.nextLine();
        System.out.println("");
        //mencetak karakter dan inputan scan pada variabel customer

        for (int i = 1; i < 6; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            harga = scan.nextInt();
            barang[i - 1] = harga;
            total = total + harga;
            
        }
        System.out.println("Total harga pembelian atas nama " + customer + " adalah Rp." + total);
        System.out.println("");
        
        if (barang[0] < 10000 || barang[1] < 10000 || barang[2] < 10000 || barang[3] < 10000 || barang[4] < 10000 ) {
         //jika semua sesuai dengan pendeklarasian diatas maka if dijalankan   
            System.out.println("--------------------------------------------");
            System.out.println("                 Terimakasih                ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
            System.out.println("--------------------------------------------");
        } else {
         //jika pendeklrasian tidak cocok dengan if makan else dijalankan
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println("--------------------------------------------");
            System.out.println("                Terimakasih                 ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
            System.out.println("--------------------------------------------");
        }
    }
}
