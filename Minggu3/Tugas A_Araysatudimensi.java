/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_A;

/**
 *
 * @author DIKYPUT PC
 */
public class Araysatudimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] namaku = {"Diky", "Putra", "Efendy"};
        //String diatas membuat kumpulan nama
        
        for (int i = 0; i < namaku.length; i++) {
        //for menggunakan looping untuk menapilkan array secara urut
        //dari index yang terkecil 0 sampai paling akhir
        
            System.out.print(namaku[i] + " ");
            //mencetak var nama dan menambahkan setiap string
            //dan nama hingga string terakhir
        }
        System.out.println("");
    }
    
}
