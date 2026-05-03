import java.util.Scanner; // import Scanner untuk membaca input dari keyboard

// Class KasirToko mensimulasikan sistem kasir dengan diskon member dan metode pembayaran
public class KasirToko {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // membuat objek Scanner yang membaca dari System.in (keyboard)

        // ── Input data pelanggan ──────────────────────────────────────────
        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = sc.nextLine(); // membaca input nama (String, boleh mengandung spasi)

        System.out.print("Total harga belanja     : ");
        double totalSebelumDiskon = sc.nextDouble(); // membaca input total belanja (tipe double)

        // ── Tampilkan menu pilihan kategori member ────────────────────────
        System.out.println("Pilih kategori member :");
        System.out.println("1. Regular  2. Silver  3. Gold  4. Platinum");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt(); // membaca pilihan angka dari user

        // Variabel untuk menyimpan hasil pilihan
        String kategoriMember; // nama kategori member yang dipilih
        double persenDiskon;   // persentase diskon berdasarkan kategori

        // ── Switch-case untuk menentukan diskon berdasarkan pilihan ───────
        switch (pilihan) {
            case 1:
                kategoriMember = "Regular"; // pilihan 1 = Regular
                persenDiskon   = 0;         // diskon 0%
                break;
            case 2:
                kategoriMember = "Silver"; // pilihan 2 = Silver
                persenDiskon   = 10;       // diskon 10%
                break;
            case 3:
                kategoriMember = "Gold"; // pilihan 3 = Gold
                persenDiskon   = 20;     // diskon 20%
                break;
            case 4:
                kategoriMember = "Platinum"; // pilihan 4 = Platinum
                persenDiskon   = 30;         // diskon 30%
                break;
            default:
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan"); // pilihan tidak valid
                kategoriMember = "Tidak Dikenal"; // set nama kategori default
                persenDiskon   = 0;               // tidak ada diskon
        }

        // ── Hitung nilai diskon dan total setelah diskon ──────────────────
        double nilaiDiskon       = totalSebelumDiskon * persenDiskon / 100; // rumus: total * persen / 100
        double totalSetelahDiskon = totalSebelumDiskon - nilaiDiskon;        // total dikurangi diskon

        // ── If-else untuk menentukan metode pembayaran ────────────────────
        String metodePembayaran; // variabel untuk menyimpan metode yang tersedia
        if (totalSetelahDiskon < 50000) {
            metodePembayaran = "Tunai"; // total < 50.000 hanya bisa tunai
        } else if (totalSetelahDiskon < 200000) {
            metodePembayaran = "Tunai / Transfer"; // 50.000 <= total < 200.000 bisa tunai atau transfer
        } else {
            metodePembayaran = "Tunai / Transfer / Kartu Kredit"; // total >= 200.000 semua metode tersedia
        }

        // ── Cetak struk pembayaran ────────────────────────────────────────
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.printf("Nama Pelanggan  : %s%n",       namaPelanggan);          // cetak nama
        System.out.printf("Kategori Member : %s%n",       kategoriMember);         // cetak kategori
        System.out.printf("Total Belanja   : Rp %,.0f%n", totalSebelumDiskon);     // cetak total sebelum diskon
        System.out.printf("Diskon (%.0f%%)   : Rp %,.0f%n", persenDiskon, nilaiDiskon); // cetak potongan diskon
        System.out.printf("Total Bayar     : Rp %,.0f%n", totalSetelahDiskon);     // cetak total setelah diskon
        System.out.println("--------------------------------------");
        System.out.println("Metode Pembayaran: " + metodePembayaran); // cetak metode yang tersedia
        System.out.println("======================================");

        sc.close(); // menutup Scanner setelah selesai digunakan
    }
}
