package Perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // Membuat beberapa objek buku (Harus 3 data: Judul, Penulis, Tahun)
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980);
        Buku buku3 = new Buku("Sang Pemimpi", "Andrea Hirata", 2006);

        // Menambahkan buku ke perpustakaan
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);

        // Menampilkan kondisi awal
        perpus.tampilkanSemuaBuku();

        System.out.println("\n--- Menguji Peminjaman & Pengembalian ---");
        perpus.pinjamBuku("Laskar Pelangi");
        
        // Menguji LATIHAN 1: Mengembalikan buku
        perpus.kembalikanBuku("Laskar Pelangi");
        
        // Memastikan status sudah berubah
        perpus.tampilkanSemuaBuku();

        System.out.println("\n--- Menguji LATIHAN 3 ---");
        // Menguji LATIHAN 3: Mencari penulis
        perpus.cariPenulis("Andrea Hirata");
    }
}