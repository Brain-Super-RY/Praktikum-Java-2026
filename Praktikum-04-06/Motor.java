// Class Motor mewarisi (extends) semua atribut dan method dari class Kendaraan
public class Motor extends Kendaraan {

    private String jenisMesin; // Atribut khusus Motor, private = hanya bisa diakses di class ini

    // Constructor Motor menerima 3 parameter termasuk jenisMesin
    public Motor(String merk, int kecepatanMaksimal, String jenisMesin) {
        super(merk, kecepatanMaksimal); // super() memanggil constructor class Kendaraan
        this.jenisMesin = jenisMesin;   // mengisi atribut jenisMesin milik Motor
    }

    // Override method gerakkan() dari class Kendaraan dengan pesan khusus Motor
    @Override
    public void gerakkan() {
        System.out.println("Motor " + merk + " melaju di jalan!"); // merk diambil dari class Kendaraan
    }

    // Override infoKendaraan() agar turut menampilkan jenisMesin
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();                                       // panggil method parent untuk cetak merk & kecepatan
        System.out.println("Jenis Mesin        : " + jenisMesin);   // tambahkan info jenis mesin
    }
}
