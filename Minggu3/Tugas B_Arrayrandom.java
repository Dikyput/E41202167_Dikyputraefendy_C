/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_b;


import java.util.Scanner;
import java.util.Random;
//memasukan paket paket yang dibutuhkan untuk
//menjalankan fungsi fungsinya di program
/**
 *
 * @author DIKYPUT PC
 */
public class Arrayrandom {

    public static void main(String[] args) {
        int jumlah = 0;
        //membuat variabel jumlah
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //menjalankan fungsi paket scanner yang telah di import
        
        System.out.print("Masukkan jumlah deretan array : ");
        //mencetak Output Text
        jumlah = scan.nextInt();
        //meminta memasukan dan melakukan scan pada variabel jumlah         
        for (int i = 0; i <= jumlah - 1; i++) {
        //membuat for lopping pada variabel jumlah
            int[] bebas = new int[jumlah];
            bebas[i] = random.nextInt(100);
        //membuat array bebas yang dimasukan kedalam variabel bebas
        //kemudian membuat ramdom int 1 sampai 100
            System.out.print("|" + bebas[i] + "|");
        //mencetak karakter dan variabel bebas yang sudah diseleksi
        }
        System.out.println("");
    }
    
}
