/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan62livingthing;

/**
 *
 * @author Yogaputra
 * Nama                 : Arditya Yogaputra S
 * Kelas                : PBO3
 * NIM                  : 10117119
 * Deskripsi Program    : Program ini menampilkan data tentang mahkluk hidup
 */
public class PBO310117119Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Arditya");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }

}
