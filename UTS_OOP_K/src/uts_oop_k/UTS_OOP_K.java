/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop_k;
import java.util.Scanner;

/**
 *
 * @author Yudhi Putra
 * TGL 10 Mei 2025
 */
public class UTS_OOP_K {
    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
    static int jumlah = 0;
    static Scanner input = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    static void menu() {
        System.out.println("\n=== MENU DATA MAHASISWA KELAS K ===");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Ubah Data Mahasiswa");
        System.out.println("4. Hapus Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int pilih = input.nextInt(); input.nextLine();

        switch (pilih) {
            case 1: tambahMahasiswa(); break;
            case 2: tampilkanMahasiswa(); break;
            case 3: ubahMahasiswa(); break;
            case 4: hapusMahasiswa(); break;
            case 5: System.out.println("Terima kasih!"); System.exit(0);
            default: System.out.println("Pilihan tidak valid!");
        }
    }

    static void tambahMahasiswa() {
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Prodi: ");
        String prodi = input.nextLine();
        System.out.print("Angkatan: ");
        int angkatan = input.nextInt(); input.nextLine();

        daftarMahasiswa[jumlah] = new Mahasiswa(nama, nim, prodi, angkatan);
        jumlah++;
        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampilkanMahasiswa() {
        if (jumlah == 0) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + ". " + daftarMahasiswa[i]);
            }
        }
    }

     static void ubahMahasiswa() {
        if (jumlah == 0) {
            System.out.println("Belum ada data mahasiswa untuk diubah.");
            return;
        }

        // Menampilkan daftar mahasiswa
        System.out.println("\n=== Pilih Mahasiswa yang ingin diubah ===");
        tampilkanMahasiswa();

        // Memilih mahasiswa
        System.out.print("Masukkan nomor mahasiswa yang ingin diubah: ");
        int pilih = input.nextInt(); input.nextLine();

        if (pilih < 1 || pilih > jumlah) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        // Mengubah data mahasiswa yang dipilih
        Mahasiswa mahasiswa = daftarMahasiswa[pilih - 1];
        System.out.println("Data mahasiswa yang dipilih: " + mahasiswa);
        System.out.print("Nama baru: ");
        mahasiswa.setNama(input.nextLine());
        System.out.print("Prodi baru: ");
        mahasiswa.setProdi(input.nextLine());
        System.out.print("Angkatan baru: ");
        mahasiswa.setAngkatan(input.nextInt()); input.nextLine();

        System.out.println("Data mahasiswa berhasil diubah.");
    }

    static void hapusMahasiswa() {
        if (jumlah == 0) {
            System.out.println("Belum ada data mahasiswa untuk dihapus.");
            return;
        }

        // Menampilkan daftar mahasiswa
        System.out.println("\n=== Pilih Mahasiswa yang ingin dihapus ===");
        tampilkanMahasiswa();

        // Memilih mahasiswa
        System.out.print("Masukkan nomor mahasiswa yang ingin dihapus: ");
        int pilih = input.nextInt(); input.nextLine();

        if (pilih < 1 || pilih > jumlah) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        // Menghapus data mahasiswa yang dipilih
        for (int i = pilih - 1; i < jumlah - 1; i++) {
            daftarMahasiswa[i] = daftarMahasiswa[i + 1];
        }
        jumlah--;
        System.out.println("Data mahasiswa berhasil dihapus.");
    }
}
       
   
