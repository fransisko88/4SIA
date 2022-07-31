package Scanner;
import java.util.Scanner;
public class Beraksi {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int a,b;
        int bil1,bil2;
        double tugas,uts,uas;
        
        
        System.out.print("Masukkan Bilangan 1 :");
        bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2 :");
        bil2 = input.nextInt();
        
        Aritmatika obj = new Aritmatika(bil1,bil2);
        obj.cetak();
        
//        System.out.print("Masukkan Bilangan 1 : ");
//        a = input.nextInt();
//        
//        System.out.print("Masukkan Bilangan 2 : ");
//        b = input.nextInt();
//        System.out.print("Masukkan Nilai Tugas : ");
//        tugas = input.nextDouble();
//        System.out.print("Masukkan Nilai UTS : ");
//        uts = input.nextDouble();
//        System.out.print("Masukkan Nilai UAS : ");
//        uas = input.nextDouble();
//        Aritmatika obj = new Aritmatika();
//        obj.penjumlahan(a,b);
//        obj.NilaiAkhir(tugas, uts, uas);
    }
}
