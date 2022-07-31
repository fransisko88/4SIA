package latihan;
public class Pasar {
 
    public void belanja(int tabungan, int uangSaku, int pengeluaran){
        int sisauang;
        sisauang = (tabungan + uangSaku) - pengeluaran;
        System.out.println("Saya memiliki uang tabungan sebesar " +tabungan );
        System.out.println("Saya memiliki uang saku sebesar " +uangSaku );
        System.out.println("Saya memiliki pengeluaran sebesar  " +pengeluaran );
        System.out.println("Sisa uang saya adalah  " +sisauang );
    }
}
