/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg02.pkg03;

/**
 *
 * @author ACER NITRO
 */
public class Entity implements InterfaceEntity {
    // Atribut private untuk encapsulation
    private String nama;
    private double hp;
    private double attack;
    
    // Constructor dengan parameter
    public Entity(String nama, double hp, double attack) {
        this.nama = nama;
       
        this.hp = hp + BASE_HP;
        this.attack = attack + BASE_ATTACK;
    }
    
    // Method untuk menampilkan status
    public void infoStatus() {
        System.out.println("=== Status Entity ===");
        System.out.println("Nama   : " + nama);
        System.out.println("HP     : " + hp);
        System.out.println("Attack : " + attack);
        System.out.println("====================");
    }
}
