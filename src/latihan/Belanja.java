package latihan;
public class Belanja {
   int hasil,a,b;
   int harga,diskon;
   String nama;
   
   public Belanja(String Namabarang,int harga,int diskon,int a , int b){
       this.harga = harga;
       this.nama = Namabarang;
       this.diskon = diskon;
       this.a = a;
       this.b = b;
      
   }
   
   public void belanja1(){
       
       System.out.println("Barang 1 : " + harga);
       System.out.println("Barang 2 : " + diskon);
       hasil = harga+diskon;
       System.out.println("Hasil  1 : " + hasil);
       
   }
   public void belanja2(){
       System.out.println("Barang 1 : " + a);
       System.out.println("Barang 2 : " + b);
       hasil = harga+diskon+hasil;
       System.out.println("Hasil  2 : " + hasil);
   }
   
   int getHasil(){
       return hasil;
   }
}
