package latihan;
public class Coba {
    String nama,jurusan;
    int npm;
    
    
    void Biodata(){
        System.out.println("Nama saya adalah Fransisko Sihombing");
        System.out.println("Kelas saya di 4SIA");
    }
    
    void BiodataParameter(String nama,int npm){
        System.out.println("Nama saya adalah " + nama);
        System.out.println(" npm saya adalah " + npm);
    }
    
    void Tambah(double bil1, int bil2){
        double hasil;
        hasil = bil1 + bil2;
        System.out.println("Hasil dari penjumlahan adalah " + hasil);
    }
    
    void HitungLuasSegitiga(int alas,int tinggi){
        double LuasSegitiga;
        LuasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Hasil dari Luas Segitiga adalah " + LuasSegitiga);
    }
    
        
}
