/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg02.pkg03;

/**
 *
 * @author ACER NITRO
 */
public class GameRPG {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("        GAME RPG - TUGAS 2 & 3         ");
        System.out.println("========================================");
        System.out.println();
        
        System.out.println(">>> Entity Player <<<");
        Entity player = new Entity("Himmel", 100, 250);
        player.infoStatus();
        System.out.println();
        
        System.out.println(">>> Knight <<<");
        Knight knight = new Knight("Stark", 200, 150, 100);
        knight.infoStatus();
        System.out.println();
        
        System.out.println("========================================");
        System.out.println("Penjelasan:");
        System.out.println("- HP dan Attack otomatis ditambah dengan BASE_HP (500.0) dan BASE_ATTACK (300.0)");
        System.out.println("- Knight mewarisi semua dari Entity dan menambahkan atribut Defense");
        System.out.println("========================================");
    }
}