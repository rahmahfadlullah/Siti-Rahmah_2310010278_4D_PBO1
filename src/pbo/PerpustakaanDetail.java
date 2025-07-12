
// Subclass (Inheritance) dari Perpustakaan

package pbo;

public class PerpustakaanDetail extends Perpustakaan {
    // Atribut tambahan (Encapsulation)
    private boolean statusDipinjam;
    
    // Constructor dengan super() untuk inheritance
    public PerpustakaanDetail(String judul, String pengarang, int tahunTerbit, String kodeBuku, String kategori, String jenisMedia, String kodeRegistrasi, boolean statusDipinjam) {
        super(judul, pengarang, tahunTerbit, kodeBuku, kategori, jenisMedia, kodeRegistrasi);
        this.statusDipinjam = statusDipinjam;
    }

    // Accessor
    public boolean isStatusDipinjam() {
        return statusDipinjam;
    }

    // Mutator
    public void setStatusDipinjam(boolean statusDipinjam) {
        this.statusDipinjam = statusDipinjam;
    }

    // Polymorphism - override method displayInfo dari superclass
    @Override
    public String displayInfo() {
        String status = isStatusDipinjam() ? "Sedang Dipinjam" : "Tersedia";
        return super.displayInfo() + "\nStatus          : " + status;
    }
}
