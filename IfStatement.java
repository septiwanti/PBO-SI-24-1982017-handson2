import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(source:System.in);

        System.out.print("Masukkan nomor dari 1 sampai 7: ");
        int nomorHari = scanner.nextInt(); // 'scanner' harus huruf kecil, bukan 'Scanner'
        String namaHari = "";

        // Memeriksa nomor hari dan mengeset nama hari
        if (nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            // Jika input tidak valid
            System.out.println("Masukkan nomor yang valid (1 sampai 7).");
            System.exit(0);
        }

        // Mencetak hasil nama hari yang sesuai
        System.out.println("Nama hari: " + namaHari);
    }
}