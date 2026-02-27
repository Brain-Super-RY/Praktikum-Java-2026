/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg02;

/**
 *
 * @author ACER NITRO
 */
public class MatematikaBeraksi2 {
    public static void main(String[] args) {
        // Membuat objek Matematika2 yang mengimplementasikan interface
        Matematika2 mtk = new Matematika2();
        
        // Memanggil method dan menampilkan hasil
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + mtk.pembagian(21, 2));
    }
}