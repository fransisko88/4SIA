package latihan;
public class Biodata {
    
    String nama; 
    private String aku;
    int npm; 
    double tugas,uts,uas;
    
    public Biodata(String nama , int npm, double tugas , double uts,double uas){
        this.nama = nama;
        this.npm = npm;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    
    public void cetak(){
        System.out.println("Nama saya adalah " + nama);
        System.out.println("NPM saya adalah " + npm);
    }
    
    public void NA(){
        double na;
        na = (2*tugas + 3*uts + 5*uas)/10;
        System.out.println("Nilai Tugas saya : " + tugas);
        System.out.println("Nilai UTS saya : " + uts);
        System.out.println("Nilai UAS saya : " + uas);
        System.out.println("Nilai Akhir saya : " + na);
                
    }
    
}
