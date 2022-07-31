package Scanner;
public class Aritmatika {
    int hasil,bil1,bil2;
    double na;
    
    public Aritmatika(int bil1 , int bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    public void cetak(){
        hasil = bil1+bil2*2;
        System.out.println("Hasil : " + hasil);
    }
    
    
    public void penjumlahan(int bil1 , int bil2){
        hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan " + hasil);
    }
    
    public void NilaiAkhir(double tugas,double uts, double uas){
        na = (2*tugas + 3*uts + 5*uas)/10;
        System.out.println("Nilai Akhir : " + na);
    }
    
}
