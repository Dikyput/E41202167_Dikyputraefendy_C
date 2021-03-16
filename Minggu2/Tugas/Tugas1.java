/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
/**
 *
 * @author DIKYPUT PC
 */
class personal{
    //Membuat Variable
        String fName;
        String lName;
        String stuStatus;
        int stuid ;
        
     //Membuat Set Baru Untuk Setiap Variable
        public void set (String fName, String lName, String stuStatus, int stuid){
            this.fName = fName;
            this.lName = lName;
            this.stuStatus = stuStatus;
            this.stuid = stuid;
        }
        
    //Mencetak Output Text dan Isi dari Variabel
        public void show (){
        System.out.println("Student Name: " + fName +" " +lName);
        System.out.println("Student ID: " + stuid);
        System.out.println("Student Status: " + stuStatus);
        }
    }
    
public class Tugas1 {
    public static void main(String[] args) {
    personal lisa = new personal();
    lisa.set("Lisa", "Palombo", "Active", 12345678);
    lisa.show();
    System.out.println();
    }
    
}
