package tugas;

//Nama: {Muhammad Alfianur Rahman}
// NPM: {2210010078}

public class MainTugas {
    public static void main(String[] args) {
        // 4. Menyimpan dan menampilkan array mata kuliah
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Struktur Data", "Basis Data"};
        System.out.println("Daftar Mata Kuliah:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Membuat objek pengelola kelas
        KelasKuliah kelasPBO = new KelasKuliah();

        // 3. Menambah minimal 5 objek Mahasiswa
        kelasPBO.tambahMahasiswa(new Mahasiswa("Andi", "23001", 75.5));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Budi", "23002", 55.0));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Citra", "23003", 88.0));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Dewi", "23004", 92.5));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Eko", "23005", 59.9));

        // Menampilkan semua mahasiswa
        kelasPBO.tampilkanSemua();
        System.out.println();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("--- Rekapitulasi Nilai ---");
        System.out.println("Rata-rata Nilai Kelas   : " + kelasPBO.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelasPBO.jumlahLulus());
        System.out.println("Total Data Mahasiswa    : " + kelasPBO.getJumlahData());
        System.out.println();

        // 6. Menambahkan 1 objek Mahasiswa baru dan menampilkan jumlah terbaru
        System.out.println("Menambahkan 1 mahasiswa baru atas nama Fajar...");
        kelasPBO.tambahMahasiswa(new Mahasiswa("Fajar", "23006", 80.0));
        
        System.out.println("Jumlah Data Terbaru     : " + kelasPBO.getJumlahData());
    }
}