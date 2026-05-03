// Class Mobil mewarisi (extends) semua atribut dan method dari class Kendaraan
public class Mobil extends Kendaraan {

    private int jumlahPintu; // Atribut khusus Mobil, private = hanya bisa diakses di class ini

    // Constructor Mobil menerima 3 parameter termasuk jumlahPintu
    public Mobil(String merk, int kecepatanMaksimal, int jumlahPintu) {
        super(merk, kecepatanMaksimal); // super() memanggil constructor class Kendaraan
        this.jumlahPintu = jumlahPintu; // mengisi atribut jumlahPintu milik Mobil
    }

    // Override method gerakkan() dari class Kendaraan dengan pesan khusus Mobil
    @Override
    public void gerakkan() {
        System.out.println("Mobil " + merk + " melaju di jalan raya!"); // merk diambil dari class Kendaraan
    }

    // Override infoKendaraan() agar turut menampilkan jumlahPintu
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();                                    // panggil method parent untuk cetak merk & kecepatan
        System.out.println("Jumlah Pintu       : " + jumlahPintu); // tambahkan info jumlah pintu
    }
}
