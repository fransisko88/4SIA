package Encapsulation;
public class LatihanBeraksi {
    public static void main(String [] args){
        Latihan latihan = new Latihan();
//        latihan.setNama("Budi");
//        latihan.setKelas("4SIA");
//        latihan.setNPM(218510017);
//        System.out.println("Biodataku: ");
//        System.out.println("Nama saya adalah " + latihan.getNama());
//        System.out.println("NPM saya adalah " + latihan.getNPM());
//        System.out.println("Kelas saya adalah " + latihan.getKelas());
//        latihan.setAlas(7);
//        latihan.setTinggi(8);
//        latihan.bil1 = 6;
//        System.out.println(latihan.bil1);
//        System.out.println("Nilai Alas Segitiga : " + latihan.getAlas());
//        System.out.println("Nilai Tinggi Segitiga : " + latihan.getTinggi());
//        latihan.LuasSegitiga();
//        
        latihan.setBil1(2);
        latihan.setBil2(6);
        System.out.println("Bilangan 1 : " + latihan.getBil1());
        System.out.println("Bilangan 2 : " + latihan.getBil2());
        latihan.penjumlahan();
        

    }
}
