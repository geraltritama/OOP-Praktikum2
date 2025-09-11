/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Asus
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        // Menggunakan Class Biasa (nomor 1)
        Matematika mtk = new Matematika();
        
        System.out.println("======================================");
        System.out.println(" HASIL OPERASI MENGGUNAKAN CLASS BIASA");
        System.out.println("======================================");
        System.out.println("Pertambahan   : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan   : 10 -  5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian     : 10 *  3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian     : 21 /  2 = " + mtk.pembagian(21, 2));
        
        System.out.println();
        
        // Menggunakan implements dari interface (nomor 2)
        MatematikaInterface math = new MatematikaInterface();
        
        System.out.println("===============================================");
        System.out.println(" HASIL OPERASI MENGGUNAKAN IMPLEMENTS INTERFACE");
        System.out.println("===============================================");
        System.out.println("Pertambahan   : 20 + 10 = " + math.pertambahan(20, 10));
        System.out.println("Pengurangan   : 10 -  5 = " + math.pengurangan(10, 5));
        System.out.println("Perkalian     : 10 *  3 = " + math.perkalian(10, 3));
        System.out.println("Pembagian     : 21 /  2 = " + math.pembagian(21, 2));
    }
}

    
