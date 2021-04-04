/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4a;
//memasukkan paket paket yang akan digunakan untuk menjalankan program
import java.util.Scanner;

/**
 *
 * @author DIKYPUT PC
 */
public class Minggu4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //membuat variabel int dengan nama awal dan akhir
        int awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Batas Nilai Awal : ");
        // mencetak output Karakter dan memanggil scanner untuk memasukan input angka awal 
        awal = input.nextInt();
        System.out.print("Masukan Batas Nilai Akhir : ");
        // mencetak output Karakter dan memanggil scanner untuk memasukan input angka akhir
        akhir = input.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println("Deret Bilangan Genap");
        //meemberikan perintah pada variabel i dan membandingkan dengan varibel awal dan akhir
            for(int i=awal;i<=akhir;i++){
                if (i%2==0)
        //mencetak pengeluaran hasil eksekusi diatas
            System.out.print(" | " + i+ " | ");
        }
        System.out.println("");
    }    
}
