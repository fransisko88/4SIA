package Polymorphism;
public class Bagian2 extends Bagian1 {
    
    @Override
    public void Nilai(int bil){
        super.Nilai(bil);
        point = point * getNilai();
        System.out.println("Nilai : " +point);
    }
    
}
