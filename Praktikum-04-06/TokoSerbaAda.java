import java.util.ArrayList; // import ArrayList dari package java.util

// Class TokoSerbaAda menyimpan daftar barang dan menyediakan fitur pencarian
public class TokoSerbaAda {

    // ArrayList katalog menyimpan kumpulan objek Barang secara dinamis
    ArrayList<Barang> katalog = new ArrayList<>();

    // Constructor – langsung mengisi katalog dengan 5 data barang awal (hardcode)
    public TokoSerbaAda() {
        katalog.add(new Barang("a001", "Buku",      3000)); // tambah barang ke-1
        katalog.add(new Barang("a002", "Pensil",    4000)); // tambah barang ke-2
        katalog.add(new Barang("a003", "Pulpen",    5000)); // tambah barang ke-3
        katalog.add(new Barang("a004", "Penghapus", 2000)); // tambah barang ke-4
        katalog.add(new Barang("a005", "Penggaris", 3500)); // tambah barang ke-5
    }

    // Method cariBarang() menelusuri katalog berdasarkan kode yang diinput user
    // Mengembalikan objek Barang jika ditemukan, atau null jika tidak ada
    public Barang cariBarang(String kode) {
        for (Barang b : katalog) {              // for-each loop: telusuri setiap elemen di katalog
            if (b.getKode().equalsIgnoreCase(kode)) { // bandingkan kode (abaikan huruf besar/kecil)
                return b;                       // langsung kembalikan barang yang cocok
            }
        }
        return null; // kembalikan null jika tidak ada kode yang cocok
    }
}
