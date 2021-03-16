/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
/**
 *
 * @author DIKYPUT PC
 */
public class managingPeople_class {
    String Name; //membuat variabel Name
    int Age; //membuat variabel Age
    
    public managingPeople_class(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    
    public static void main(String[] args) {
    managingPeople_class p1 = new managingPeople_class ("Arial", 37);
    managingPeople_class p2 = new managingPeople_class ("Joseph", 15);
    
    
    if(p1.getAge()==p2.getAge())//jika benar
    {
        System.out.println(p1.getName()+" is the same age as "+p2.getName());
        //mencetak output dari variable p1 membandingkan p2 dan Text
    }
    else//jika salah
    {
        System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
        //mencetak output dari variable p1 membandingkan p2 dan Text
    }
    }
    
}
