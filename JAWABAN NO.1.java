import java.util.Scanner;

// Class untuk merepresentasikan informasi smartphone
class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    // Constructor untuk inisialisasi objek Smartphone
    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter untuk mendapatkan nilai dari vendor
    public String merkVendor() {
        return vendor;
    }

    // Getter untuk mendapatkan nilai dari tipe
    public String merkTipe() {
        return tipe;
    }

    // Getter untuk mendapatkan nilai dari harga
    public double merkHarga() {
        return harga;
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Ketikkan Nama Vendor : ");
        String vendor = scan.nextLine();
        System.out.print("Ketikkan Tipe Smartphone: ");
        String tipe = scan.nextLine();
        System.out.print("Harga Smartphone: Rp. ");
        double harga = scan.nextDouble();

        // Membuat objek Smartphone
        Pajak smartphone = new Pajak(vendor, tipe, harga);

        // Menghitung harga total termasuk PPN
        double hargaTotal = hitungHargaPPN(smartphone);
        System.out.println(
                "Harga total smartphone " + smartphone.merkVendor() + " " + smartphone.merkTipe() + " termasuk PPN: Rp. " + hargaTotal
        );

        scan.close();
    }

    // Method untuk menghitung harga total termasuk PPN berdasarkan kriteria yang diberikan
    public static double hitungHargaPPN(Pajak smartphone) {
        double harga = smartphone.merkHarga();
        double ppn;
        if (harga > 4500000) {
            ppn = 0.05;
        } else if (harga > 4200000) {
            ppn = 0.02;
        } else if (harga > 4000000) {
            ppn = 0.01;
        } else {
            ppn = 0.5;
        }
        return harga + (harga * ppn);
    }
}

