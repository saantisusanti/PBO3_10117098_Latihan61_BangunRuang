/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan61_bangunruang;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan hasil hitung
 *                     volume dari bola, kerucut, dan tabung dengan konsep 
 *                     abstract
 */
public class PBO3_10117098_Latihan61_BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJari2(7);
        System.out.println("Volume Bola dengan jari-jari "+bola.getJari2()+
                " adalah " + bola.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setTinggi(21);
        tabung.setJari2(10);
        System.out.println("Volume Tabung dengan jari-jari "+tabung.getJari2()+
                " dan tinggi "+tabung.getTinggi()+" adalah "+tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari2(14);
        kerucut.setTinggi(9);
        System.out.println("Volume Kerucut dengan jari-jari "+kerucut.getJari2()+
                " dan tinggi "+kerucut.getTinggi()+" adalah "
                +kerucut.hitungVolume());
    }
    
}
