/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum.pkg07.pkg08;

/**
 *
 * @author ACER NITRO
 */
public class HitungHari {
 
    private int tahun;
    private int bulan; // 1 = Januari … 12 = Desember
 
    public HitungHari(int tahun, int bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    }
 
    /** Kembalikan jumlah hari pada bulan & tahun yang disimpan. */
    public int hitung() {
        switch (bulan) {
            case 1:  // Januari
            case 3:  // Maret
            case 5:  // Mei
            case 7:  // Juli
            case 8:  // Agustus
            case 10: // Oktober
            case 12: // Desember
                return 31;
 
            case 4:  // April
            case 6:  // Juni
            case 9:  // September
            case 11: // November
                return 30;
 
            case 2:  // Februari — cek tahun kabisat
                return isTahunKabisat(tahun) ? 29 : 28;
 
            default:
                return -1; // bulan tidak valid
        }
    }
 
    /** Tahun kabisat: habis dibagi 400, atau habis 4 tapi tidak habis 100. */
    private boolean isTahunKabisat(int t) {
        return (t % 400 == 0) || (t % 4 == 0 && t % 100 != 0);
    }
}
