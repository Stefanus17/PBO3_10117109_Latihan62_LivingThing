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
public abstract class LivingThing {
 
    public abstract void walk(String nama);
    public void breath(String nama){
        System.out.println("Bernafas"); 
    }
    public void eat (String nama){
        System.out.println("Makan");
        
    }
}
