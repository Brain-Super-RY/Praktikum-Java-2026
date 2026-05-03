// Class utama untuk menjalankan demonstrasi Polymorphism
public class MainKendaraan {

    public static void main(String[] args) {

        // Polymorphism: variabel bertipe Kendaraan menampung objek Mobil
        // Ini bisa dilakukan karena Mobil adalah turunan dari Kendaraan
        Kendaraan k1 = new Mobil("Toyota Avanza", 160, 4);

        // Polymorphism: variabel bertipe Kendaraan menampung objek Motor
        // Ini bisa dilakukan karena Motor adalah turunan dari Kendaraan
        Kendaraan k2 = new Motor("Honda CBR", 200, "4-Tak");

        System.out.println("===== Info Kendaraan 1 =====");
        k1.infoKendaraan(); // memanggil infoKendaraan() versi Mobil (hasil override)
        k1.gerakkan();      // memanggil gerakkan() versi Mobil (hasil override)

        System.out.println();

        System.out.println("===== Info Kendaraan 2 =====");
        k2.infoKendaraan(); // memanggil infoKendaraan() versi Motor (hasil override)
        k2.gerakkan();      // memanggil gerakkan() versi Motor (hasil override)
    }
}
