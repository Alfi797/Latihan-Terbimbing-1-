package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan daftar mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Method tambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method hitung rata-rata
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double totalNilai = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            totalNilai = totalNilai + mhs.getNilai();
        }
        return totalNilai / daftarMahasiswa.size();
    }

    // Method menghitung jumlah yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // Method menampilkan semua data
    public void tampilkanSemua() {
        System.out.println("--- Daftar Mahasiswa ---");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println("Nama: " + mhs.getNama() + " | NPM: " + mhs.getNpm() + " | Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
    }
    
    // Method tambahan untuk mengambil jumlah data saat ini
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}