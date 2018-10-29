/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan62_livingthing;

/**
 * Nama  : STefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan makhluk hidup
* dengan konsep abstract
 */
public class PBO3_10117109_Latihan62_LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        System.out.print(human.getNama()+" ");
        human.walk("");
        System.out.print(human.getNama()+" ");
        human.breath("");
        System.out.print(human.getNama()+" ");
        human.eat("");
    }
    
}
