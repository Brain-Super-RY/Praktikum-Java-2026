/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg02;

/**
 *
 * @author ACER NITRO
 */
public class Matematika2 implements InterfaceMatematika {
    
    // Implementasi method pertambahan dari interface
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    // Implementasi method pengurangan dari interface
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Implementasi method perkalian dari interface
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    // Implementasi method pembagian dari interface
    public int pembagian(int a, int b) {
        return a / b;
    }
}
