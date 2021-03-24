/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_c;

/**
 *
 * @author DIKYPUT PC
 */
public class array2d {


    public static void main(String[] args) {
    int[][] array = {{5, 6, 1, 7}, {8, 1, 2, 9}, {5, 4, 7, 1}, {8, 3, 7, 5}};
    //membuat array 2 dimensi yang menggunakan tipe integer
        for(int kanan = 0; kanan < 4; kanan++) {
            for(int bawah = 0; bawah < 4; bawah++) {
            //membuat for lopping pada variabel bawah
                System.out.print(" "+ array[kanan][bawah] + " ");
            //mencetak karakter dan array kana dan bawah yang sudah diseleksi
            }
            System.out.println("");
        }
    }
    
}
