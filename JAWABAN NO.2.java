import java.util.Scanner;

public class KategoriUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama dan umur manusia
        System.out.print("Masukkan nama manusia: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur manusia: ");
        int umur = input.nextInt();

        // Tentukan kategori umur
        String kategoriUmur = " ";

        if (umur < 5) {
            kategoriUmur = "balita";
        } else if (umur >= 5 && umur < 12) {
            kategoriUmur = "anak";
        } else if (umur >= 12 && umur < 18) {
            kategoriUmur = "remaja";
        } else if (umur >= 18 && umur < 40) {
            kategoriUmur = "dewasa";
        } else if (umur >= 40 && umur < 60) {
            kategoriUmur = "paruh baya";
        } else {
            kategoriUmur = "lanjut usia";
        }

        // Output hasil
        System.out.println("Kategori umur " + nama + " adalah: " + kategoriUmur);

        input.close();
}
}