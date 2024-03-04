package tugasperulangan;

import java.util.Scanner;

public class Nomor_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input angka dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = in.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = in.nextInt();

        // Mencari FPB menggunakan perulangan
        int fpb = bil1; // Inisialisasi FPB dengan bilangan pertama
        while (bil2 != 0) {
            int temp = bil2; // Simpan bil2 sementara
            bil2 = fpb % bil2; // Perbarui bil2 dengan sisa bagi fpb / bil2
            fpb = temp; // Perbarui fpb dengan nilai bil2 yang disimpan sebelumnya
        }

        // Tampilkan hasil
        System.out.println("FPB dari " + bil1 + " dan " + bil2 + " adalah: " + fpb);
    }
}
