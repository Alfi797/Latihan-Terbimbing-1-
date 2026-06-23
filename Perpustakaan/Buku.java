package Perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean isDipinjam;
    private int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isDipinjam() { return isDipinjam; }
    public void setDipinjam(boolean status) { this.isDipinjam = status; }

    public void info() {
        String status = isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("- " + judul + " karya " + penulis + " (" + tahunTerbit + ") [" + status + "]");
    }
}