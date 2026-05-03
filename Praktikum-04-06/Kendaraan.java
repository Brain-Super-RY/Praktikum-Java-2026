// Abstract class tidak bisa langsung dibuat objeknya, harus diturunkan dulu
public abstract class Kendaraan {

    protected String merk;            // Atribut merk, protected = bisa diakses class turunan
    protected int kecepatanMaksimal;  // Atribut kecepatan maksimal kendaraan

    // Constructor dengan dua parameter untuk mengisi atribut saat objek dibuat
    public Kendaraan(String merk, int kecepatanMaksimal) {
        this.merk = merk;                           // this.merk merujuk ke atribut class ini
        this.kecepatanMaksimal = kecepatanMaksimal; // mengisi atribut kecepatanMaksimal
    }

    // Abstract method wajib di-override oleh semua class turunan
    public abstract void gerakkan();

    // Method biasa yang menampilkan info dasar kendaraan
    public void infoKendaraan() {
        System.out.println("Merk               : " + merk);               // cetak merk
        System.out.println("Kecepatan Maksimal : " + kecepatanMaksimal + " km/jam"); // cetak kecepatan
    }
}
