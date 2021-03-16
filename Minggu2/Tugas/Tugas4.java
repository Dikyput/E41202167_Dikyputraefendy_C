/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author DIKYPUT PC
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String s1 ="ABC";
   String s2 = new String ("DEF");
   String s3 ="AB" + "C"; 
   
       //s1 compare s2
   int d1 = s1.compareTo(s2);
       System.out.println("s1 compare s2 : "+d1);
       //mencetak output Text dan hasil dari variabel d1
      
       //s2 equals s3 
       System.out.println("s1 equals s3 : "+s2.equals(s3));
      //mencetak output Text dan hasil dari equals s2 dengan s3
      
       //s3 == s1
       System.out.println("s3 == s1 : "+s3.equalsIgnoreCase(s1));
       //mencetak output Text dan hasil dari equalsIgnoreCase s2 dengan s3
       
       //s1 compare s2
   int d4 = s2.compareTo(s3);
       System.out.println("s2 compare s3 : "+d4);
       //mencetak output Text dan hasil dari variabel d4
       
       //s3 equals s1 
       System.out.println("s3 equals s1 : "+s3.equals(s1));
       //mencetak output Text dan hasil dari equals s3 dengan s1
    }
    
}
