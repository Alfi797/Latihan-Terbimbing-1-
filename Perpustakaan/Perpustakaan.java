package Perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksiBuku) {
            if (b.getJudul().equalsIgnoreCase(judul) && !b.isDipinjam()) {
                b.setDipinjam(true);
                System.out.println("Berhasil meminjam buku: " + judul);
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan atau sedang dipinjam.");
    }

    public void kembalikanBuku(String judul) {
        for (Buku b : koleksiBuku) {
            if (b.getJudul().equalsIgnoreCase(judul) && b.isDipinjam()) {
                b.setDipinjam(false);
                System.out.println("Berhasil mengembalikan buku: " + judul);
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak sedang dipinjam atau tidak ditemukan.");
    }

    public void cariPenulis(String penulis) {
        System.out.println("\nMencari buku karya: " + penulis);
        boolean ditemukan = false;
        for (Buku b : koleksiBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                b.info();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku karya " + penulis + " di perpustakaan.");
        }
    }
    
    public void tampilkanSemuaBuku() {
        System.out.println("\nDaftar Semua Buku di Perpustakaan:");
        for (Buku b : koleksiBuku) {
            b.info();
        }
    }
}