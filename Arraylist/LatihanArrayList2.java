import java.util.ArrayList;

public class LatihanArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        
        // Menambahkan 5 angka
        angka.add(12);
        angka.add(45);
        angka.add(9);
        angka.add(78);
        angka.add(23);
        
        // Mengambil elemen pertama sebagai nilai awal
        int max = angka.get(0);
        
        // Menelusuri seluruh elemen
        for (int a : angka) {
            if (a > max) {
                max = a; // Update nilai max jika ada yang lebih besar
            }
        }
        
        System.out.println("Nilai terbesar dalam ArrayList adalah: " + max);
    }
}