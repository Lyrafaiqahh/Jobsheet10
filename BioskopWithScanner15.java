import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, menuOption;
        String nama;
        // deklarasi dan inisialisasi array 2 dimensi
        String[][] penonton = new String[4][2];

        do {
            System.out.println("---------------------------------");
            System.out.println("MENU:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pilih menu: ");
            menuOption = input.nextInt();
            input.nextLine(); // Consume newline left-over

            switch (menuOption) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama (ketik 'stop' untuk kembali ke menu): ");
                        nama = input.nextLine();
                        if (nama.equalsIgnoreCase("stop")) {
                            break;
                        }
                        System.out.print("Masukkan baris: ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = input.nextInt();
                        input.nextLine(); // Consume newline left-over

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            penonton[baris - 1][kolom - 1] = nama;
                        } else {
                            System.out.println("Baris atau kolom tidak valid.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("DAFTAR PENONTON:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (menuOption != 3);

        input.close();
    }
}