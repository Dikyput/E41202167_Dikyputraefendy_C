/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
class book {
    int price;
    int pages;
    
    public void set (int price,int pages) {
        this.price = price;
        this.pages = pages;
    }
    
    public void show (){
        System.out.println("books information");
        System.out.println("books price : "+price);
        System.out.println("books price : "+pages);
    }
}
/**
 *
 * @author DIKYPUT PC
 */
public class Latihan3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        book gamebook = new book();
        gamebook.set(80000, 100);
        gamebook.show();
    }
    
}
