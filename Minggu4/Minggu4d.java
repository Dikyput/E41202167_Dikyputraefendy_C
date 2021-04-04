/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4d;
//memasukkan paket paket yang akan digunakan untuk menjalankan program
import java.util.Scanner;
/**
 *
 * @author DIKYPUT PC
 */
public class Minggu4d {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Masukan Banyaknya Data Nilai : ");
     int angka = input.nextInt();
     int[] nilai = new int[angka];
        int count = 0;
        int sum = 0;
        int avg = 0;
        int min = 0;
        int max = 0;

        // mendeklarasikan banyaknya data input nilai
        for (int d = 0; d < angka; d++) {
            System.out.print("nilai ke-" + (d+1) + " : ");
            nilai[d] = input.nextInt();
        }
        min = nilai[0];
        max = nilai[0];
         for(int i=0;i<nilai.length;i++){
            sum += nilai[i]; 
            count++; 
            if(nilai[i] > max){ 
                max = nilai[i];
            }else if(nilai[i] < min){ 
                min = nilai[i];
            }
            
        }
         //mencetak pengeluaran karakter
        System.out.println(" ");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maximal : " + max);
        avg = sum / count; 
        System.out.println("Nilai rata ratanya adalah = " + avg);
        
    }
}

