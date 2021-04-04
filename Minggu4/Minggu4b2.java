/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4b2;

/**
 *
 * @author DIKYPUT PC
 */
public class Minggu4b2 {
public static void main(String[] args)
    {  
        //Mencetak output karakter
     System.out.println("       do while");
     System.out.println("Bilangan Kelipatan 2 (0-100)");
     System.out.println("----------------------------");
     System.out.println("----------------------------");
     //membuat variable kelipatan dan memberi nama 2
     int perkalian = 2;
        do {
            //memanggil output dari isi variabel kelipatan
            System.out.print(" | " + perkalian + " | ");
            //mengalikan variable perkalian dengan 2 dan menjalankan sampai
            //perklian lebih kecil sama dengan angka 100
            perkalian=perkalian*2;
        } while(perkalian <= 100);
    }
}
