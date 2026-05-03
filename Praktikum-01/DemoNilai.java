/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg01;

/**
 *
 * @author ACER NITRO
 */
public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek Nilai
        Nilai nilai = new Nilai();
        
        // Mengisi variabel
        nilai.NIM = "2341720067";
        nilai.Nama = "Slamet Riyadi";
        nilai.nilaiAbsen = 85;
        nilai.nilaiTugas = 90;
        nilai.nilaiUTS = 80;
        nilai.nilaiUAS = 88;
        
        // Memanggil method CetakNilai()
        nilai.CetakNilai();
    }
}
