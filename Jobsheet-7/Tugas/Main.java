package Tugas;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== Dosen ===");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();    

        System.out.println("\n=== Mahasiswa ===");
        mhs.bernafas();     
        mhs.makan();  
        mhs.tidur();       
    }
}
