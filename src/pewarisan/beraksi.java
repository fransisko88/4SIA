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
public class beraksi {
    public static void main(String [] args){
        induk idk = new induk();
        
//        idk.bilangan1(3);
//        idk.bilangan2(6);
//        
        
        idk.setTugas(82);
        idk.setUts(78);
        idk.setUas(85);
        
        System.out.println("Nilai Tugas : " + idk.getTugas());
        System.out.println("Nilai UTS : " + idk.getUts());
        System.out.println("Nilai UAS : " + idk.getUas());
        
        idk.NA();
    }
}
