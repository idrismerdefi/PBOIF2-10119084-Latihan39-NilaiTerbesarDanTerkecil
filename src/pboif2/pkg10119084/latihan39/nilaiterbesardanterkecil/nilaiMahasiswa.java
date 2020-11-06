/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan39.nilaiterbesardanterkecil;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program nilai terbesar dan terkecil
 **/

import java.util.ArrayList;
import java.util.List;

public class nilaiMahasiswa {
    private final List<Integer> nilai = new ArrayList();
    private int jmlMahasiswa, terbesar, terkecil;
    
    public void setNilai(int nilai) {
        this.nilai.add(nilai);
    }

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }
    
    private void hitungNilaiTerbesar(int idx) {
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungNilaiTerkecil(int idx) {
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }

    public void tampilNilai() {
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for(int i = 0; i < nilai.size(); i++) {
            hitungNilaiTerbesar(i);
            hitungNilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "
                    + nilai.get(i));
        }
        
        // output hasil
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
    }
}
