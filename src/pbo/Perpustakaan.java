
// Superclass yang berisi atribut umum buku

package pbo;

public class Perpustakaan {
    // Atribut umum buku (Encapsulation - disimpan private)
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String kodeBuku;
    private String kategori;
    private String jenisMedia;
    private String kodeRegistrasi;

    // Constructor - untuk inisialisasi objek
    public Perpustakaan(String judul, String pengarang, int tahunTerbit, String kodeBuku,
                        String kategori, String jenisMedia, String kodeRegistrasi) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.kodeBuku = kodeBuku;
        this.kategori = kategori;
        this.jenisMedia = jenisMedia;
        this.kodeRegistrasi = kodeRegistrasi;
    }

    // Accessor (Getter) - prinsip Encapsulation
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public int getTahunTerbit() { return tahunTerbit; }
    public String getKodeBuku() { return kodeBuku; }
    public String getKategori() { return kategori; }
    public String getJenisMedia() { return jenisMedia; }
    public String getKodeRegistrasi() { return kodeRegistrasi; }

    // Mutator (Setter) - untuk mengubah data jika diperlukan
    public void setJudul(String judul) { this.judul = judul; }
    public void setPengarang(String pengarang) { this.pengarang = pengarang; }
    public void setTahunTerbit(int tahunTerbit) { this.tahunTerbit = tahunTerbit; }
    public void setKodeBuku(String kodeBuku) { this.kodeBuku = kodeBuku; }
    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setJenisMedia(String jenisMedia) { this.jenisMedia = jenisMedia; }
    public void setKodeRegistrasi(String kodeRegistrasi) { this.kodeRegistrasi = kodeRegistrasi; }

    
    // Method umum untuk menampilkan data buku
    public String displayInfo() {
        return "Judul           : " + judul +
               "\nPengarang       : " + pengarang +
               "\nTahun Terbit    : " + tahunTerbit +
               "\nKode Buku       : " + kodeBuku +
               "\nKategori        : " + kategori +
               "\nJenis Media     : " + jenisMedia +
               "\nKode Registrasi : " + kodeRegistrasi;
    }
}
