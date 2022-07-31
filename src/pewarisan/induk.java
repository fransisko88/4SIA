/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author Fransiko Sihombing
 */
public class induk extends anak{
    int hasil;
    double na;
    
    public void bilangan2(int bil2){
        hasil = getBil1() + bil2;
        
        System.out.println("Hasil Penjumlahan : " + hasil);
        
    }
    
    public void NA(){
        na = ( 2*getTugas() + 3*getUts() + 5*getUas() )/10;
        System.out.println("Nilai Akhir : " + na);
        if(na > 80){
            System.out.println("Nilai A");
        }else if(na > 70 ){
            System.out.println("Nilai B");
        }else{
            System.out.println("Tidak Lulus");
        }
    }
}
