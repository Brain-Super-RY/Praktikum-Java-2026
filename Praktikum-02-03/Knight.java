/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg02.pkg03;

/**
 *
 * @author ACER NITRO
 */
public class Knight extends Entity {
    // Atribut private defense
    private double defense;
    
    public Knight(String nama, double hp, double attack, double defense) {
        super(nama, hp, attack);
        this.defense = defense;
    }
    
    @Override
    public void infoStatus() {
        super.infoStatus();
        System.out.println("Defense: " + defense);
        System.out.println("====================");
    }
}

