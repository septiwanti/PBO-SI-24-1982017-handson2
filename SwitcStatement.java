import java.util.Scanner;

public class SwitcStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(source: System.in);
        System.out.println("Masukan nomor diantara 1 sampai 7");
        int nomorHari = scanner.nextInt();
        String namaHari;

        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Invalid input";
        }

        System.out.println("Hari ke-" + nomorHari + " adalah " + namaHari);
    }
}
}
