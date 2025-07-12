
// Program utama untuk menjalankan aplikasi perpustakaan

package pbo;

import java.util.Scanner;

public class PerpustakaanBeraksi {
    // Method Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array untuk menyimpan beberapa Objek
        PerpustakaanDetail[] daftarBuku = new PerpustakaanDetail[2]; // Array objek

        try {
            System.out.println("=== INPUT DATA BUKU PERPUSTAKAAN ===\n");
            
            //Looping Input data buku
            for (int i = 0; i < daftarBuku.length; i++) {
                System.out.println("Input Data Buku ke-" + (i + 1));
                System.out.println("---------------------");

                // input data buku
                System.out.print("Judul Buku         : ");
                String judul = input.nextLine();

                System.out.print("Pengarang          : ");
                String pengarang = input.nextLine();

                System.out.print("Tahun Terbit       : ");
                int tahunTerbit = Integer.parseInt(input.nextLine());

                System.out.print("Kode Buku          : ");
                String kodeBuku = input.nextLine();

                // Input kategori (switch-case)
                System.out.println("Pilih Kategori Buku:");
                System.out.println("01. Novel");
                System.out.println("02. Pelajaran");
                System.out.println("03. Komik");
                System.out.print("Masukkan Kode Kategori [01-03]: ");
                String kodeKategori = input.nextLine();

                // Kondisi (switch-expression)
                String kategori = switch (kodeKategori) {
                    case "01" -> "Novel";
                    case "02" -> "Pelajaran";
                    case "03" -> "Komik";
                    default -> "Tidak Diketahui";
                };

                // Input jenis media
                System.out.println("Pilih Jenis Media:");
                System.out.println("01. Buku Cetak");
                System.out.println("02. E-Book");
                System.out.print("Masukkan Kode Jenis [01/02]: ");
                String kodeJenis = input.nextLine();

                // kondisi jenis media (switch Expression)
                String jenisMedia = switch (kodeJenis) {
                    case "01" -> "Buku Cetak";
                    case "02" -> "E-Book";
                    default -> "Tidak Diketahui";
                };

                // Kondisi status
                System.out.println("Pilih Status Buku:");
                System.out.println("1. Tersedia");
                System.out.println("2. Sedang Dipinjam");
                System.out.print("Masukkan pilihan [1/2]: ");
                int pilihan = Integer.parseInt(input.nextLine());
                
                //Boolean status dengan Ternary Operator
                boolean statusDipinjam = pilihan == 2;

                String kodeRegistrasi = String.format("%02d-%s-%s-%03d", tahunTerbit % 100, kodeKategori, kodeJenis, (i + 1));

                // Object Instantiation
                daftarBuku[i] = new PerpustakaanDetail(judul, pengarang, tahunTerbit, kodeBuku,
                                                       kategori, jenisMedia, kodeRegistrasi, statusDipinjam);
                System.out.println();
            }

            // Output daftar buku
            System.out.println("========================================");
            System.out.println("         DAFTAR BUKU PERPUSTAKAAN       ");
            System.out.println("========================================\n");

            int no = 1;
            for (PerpustakaanDetail buku : daftarBuku) {
                // Ternary 
                String status = buku.isStatusDipinjam() ? "Buku Tidak Tersedia" : "Buku Tersedia";
                System.out.println("[" + no + "] " + status);
                System.out.println("----------------------------------------");
                // Polymorphism
                System.out.println(buku.displayInfo());
                System.out.println();
                no++;
            }

        } catch (NumberFormatException e) {
            // Try-Catch Block
            System.out.println("Input angka tidak valid: " + e.getMessage());
        } catch (Exception e) {
            // Error Hadling Umum
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
