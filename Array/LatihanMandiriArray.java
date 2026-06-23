public class LatihanMandiriArray {
    public static void main(String[] args) {
        double[] suhu = {28.5, 30.2, 27.8, 31.5, 29.0, 26.5};
        
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah: " + min);
    }
}