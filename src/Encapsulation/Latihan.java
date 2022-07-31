package Encapsulation;
public class Latihan {
    
    
    private String nama,kelas;
    private int npm;
    private double alas,tinggi;
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    //getter
    public String getNama(){
        return nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getKelas(){
        return kelas;
    }  
    public void setNPM(int npm){
        this.npm = npm;
    }   
    public int getNPM(){
        return npm;
    }   
    
    public void setAlas(double alas){
        this.alas = alas;
    }
    
    public double getAlas(){
        return alas;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void LuasSegitiga(){
        double luas;
        luas = 0.5 * alas * tinggi;
        System.out.println("Hasil Luas Segitiga adalah " + luas );
    }
    private int bil1,bil2;
    public void setBil1(int bil1){
        this.bil1 = bil1;
    }
    
    public int getBil1(){
        return bil1;
    }
    public void setBil2(int bil2){
        this.bil2 = bil2;
    }
    public int getBil2(){
        return bil2;
    }
    public void penjumlahan(){
        int hasil;
        hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan : " + hasil);
        
        if(hasil > 10){
            System.out.println("Nilai A");
        }else{
            System.out.println("Nilai B");
        }      
    }   
}
