// Class Barang merepresentasikan satu produk yang ada di toko
public class Barang {

    private String kode;  // kode unik barang, private = hanya bisa diakses lewat getter
    private String nama;  // nama barang
    private int    harga; // harga satuan barang dalam rupiah

    // Constructor untuk mengisi semua atribut saat objek Barang dibuat
    public Barang(String kode, String nama, int harga) {
        this.kode  = kode;  // mengisi atribut kode
        this.nama  = nama;  // mengisi atribut nama
        this.harga = harga; // mengisi atribut harga
    }

    // Getter kode – digunakan untuk membaca nilai kode dari luar class
    public String getKode()  { return kode;  }

    // Getter nama – digunakan untuk membaca nilai nama dari luar class
    public String getNama()  { return nama;  }

    // Getter harga – digunakan untuk membaca nilai harga dari luar class
    public int    getHarga() { return harga; }

    // Method untuk menampilkan informasi lengkap satu barang ke layar
    public void infoBarang() {
        System.out.printf("Kode: %-6s | Nama: %-12s | Harga: %d%n", kode, nama, harga); // format rapi dengan printf
    }
}
