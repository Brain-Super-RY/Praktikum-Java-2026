import java.util.Scanner; // import Scanner untuk membaca input dari keyboard

// Class utama untuk menjalankan program transaksi Toko Serba Ada
public class MainToko {

    public static void main(String[] args) {

        Scanner sc   = new Scanner(System.in);  // membuat objek Scanner untuk input keyboard
        TokoSerbaAda toko = new TokoSerbaAda(); // membuat objek toko sekaligus mengisi katalog awal

        // ── Tampilkan seluruh isi katalog ─────────────────────────────────
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        for (Barang b : toko.katalog) { // for-each loop: tampilkan setiap barang di katalog
            b.infoBarang();             // panggil method infoBarang() untuk setiap elemen
        }

        // ── Input jumlah item yang akan dibeli ────────────────────────────
        System.out.print("\nMasukkan Item Barang : ");
        int jumlahItem = sc.nextInt(); // membaca jumlah item transaksi dari user

        // Membuat dua array berukuran jumlahItem untuk menyimpan data transaksi
        Barang[] belanjaBarang = new Barang[jumlahItem]; // array menyimpan objek Barang yang dibeli
        int[]    belanjaJumlah = new int[jumlahItem];    // array menyimpan jumlah beli tiap item

        // ── Loop input data transaksi sebanyak jumlahItem ─────────────────
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));       // tampilkan nomor urut data

            System.out.print("Masukkan Kode          : ");
            String kode = sc.next();                         // membaca kode barang dari user

            System.out.print("Masukkan jumlah Beli   : ");
            int jumlahBeli = sc.nextInt();                   // membaca jumlah beli dari user

            Barang ditemukan = toko.cariBarang(kode);        // cari barang berdasarkan kode di katalog

            if (ditemukan == null) {
                System.out.println("Kode barang tidak ditemukan!"); // kode tidak ada di katalog
            } else {
                belanjaBarang[i] = ditemukan;   // simpan objek Barang ke array transaksi
                belanjaJumlah[i] = jumlahBeli;  // simpan jumlah beli ke array transaksi
            }
        }

        // ── Cetak struk belanja dan hitung total ──────────────────────────
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**********************");
        System.out.printf("%-4s %-12s %-14s %-8s %-12s %-12s%n",
                "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar"); // header tabel
        System.out.println("=".repeat(68)); // garis pemisah header

        int totalBayar = 0; // variabel akumulator untuk total semua transaksi
        int no = 1;         // nomor urut baris struk

        for (int i = 0; i < jumlahItem; i++) {           // loop untuk tiap item transaksi
            if (belanjaBarang[i] != null) {               // lewati item yang kodenya tidak ditemukan
                int jumlahBayar = belanjaBarang[i].getHarga() * belanjaJumlah[i]; // harga × jumlah beli
                totalBayar += jumlahBayar;                // tambahkan ke total keseluruhan

                // Cetak satu baris detail transaksi dengan format rata kolom
                System.out.printf("%-4d %-12s %-14s %-8d %-12d %-12d%n",
                        no++,                              // nomor urut (lalu tambah 1)
                        belanjaBarang[i].getKode(),        // kode barang
                        belanjaBarang[i].getNama(),        // nama barang
                        belanjaBarang[i].getHarga(),       // harga satuan
                        belanjaJumlah[i],                  // jumlah yang dibeli
                        jumlahBayar);                      // total bayar item ini
            }
        }

        System.out.println("=".repeat(68));                            // garis pemisah footer
        System.out.printf("%-42s %-12d%n", "Total Bayar", totalBayar); // cetak total keseluruhan
        System.out.println("=".repeat(68));                            // garis penutup

        sc.close(); // menutup Scanner setelah selesai digunakan
    }
}
