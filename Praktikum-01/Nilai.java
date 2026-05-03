/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg01;

/**
 *
 * @author ACER NITRO
 */
public class Nilai {
    // Variable/Attribute
    String NIM;
    String Nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    // Method Nilai
    void Nilai() {
    }
    
    // Method CetakNilai
    void CetakNilai() {
        // Hitung nilai akhir berdasarkan bobot
        nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
        
        System.out.println("NIM              : " + NIM);
        System.out.println("Nama             : " + Nama);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%] : " + nilaiTugas);
        System.out.println("Nilai UTS[30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS[40%]   : " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
    }
}
