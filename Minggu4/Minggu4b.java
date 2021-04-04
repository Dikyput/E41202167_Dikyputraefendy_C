/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4b;

/**
 *
 * @author DIKYPUT PC
 */
public class Minggu4b {
    public static void main(String[] args)
    {  
        //Mencetak output karakter
     System.out.println("       do while");
     System.out.println("Bilangan Kelipatan 2 (0-100)");
     System.out.println("----------------------------");
     System.out.println("----------------------------");
     //membuat variable kelipatan dan memberi nama 2
     int kelipatan = 2;
        do {
            //memanggil output dari isi variabel kelipatan
            System.out.print(" | " + kelipatan + " | ");
            //menjumblahkan variable kelipatan dengan 2 dan menjalankan sampai
            //kelipatan lebih kecil sama dengan angka 100
            kelipatan=kelipatan+2;
        } while(kelipatan <= 100);
    }
}
