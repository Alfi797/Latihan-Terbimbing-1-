public class LatihanMandiri3 {
    public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};
        int hitung = 0;
        
        for (int a : angka) {
            if (a % 2 == 0) {
                hitung++;
            }
        }
        
        System.out.println("Jumlah angka genap: " + hitung);
    }
}