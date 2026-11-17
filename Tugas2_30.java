import java.util.Scanner;

public class Tugas2_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino","Chocolate Ice"};

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " | Rp" + harga[i]);
        }

        System.out.print("\nMasukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int[] totalHarga = new int[jumlah];

        int total = 0;

        for (int i = 0; i < jumlah; i++) {

            boolean ditemukan = false;
            int posisi = -1;

            while (!ditemukan) {
                System.out.print("\nMasukkan nama menu ke-" + (i + 1) + ": ");
                String cari = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cari)) {
                        posisi = j;
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia, silakan pilih kembali.");
                }
            }

            System.out.println("Harga: Rp" + harga[posisi]);

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyak = sc.nextInt();
            sc.nextLine();

            pesanan[i] = menu[posisi] + " x" + banyak;
            totalHarga[i] = harga[posisi] * banyak;

            total += totalHarga[i];
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println(pesanan[i] + " = Rp" + totalHarga[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total pembayaran: Rp" + total);
    }
}