import java.util.ArrayList;

public class LatihanArrayList1 {
    public static void main(String[] args) {
        // Membuat ArrayList
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambahkan 4 item
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng"); // Ini adalah item ke-2 (indeks 1)
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");
        
        // Menghapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);
        
        // Menampilkan isi list
        System.out.println("Isi daftar belanja sekarang:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }
        
        // Menampilkan jumlah akhir
        System.out.println("Jumlah item: " + daftarBelanja.size());
    }
}