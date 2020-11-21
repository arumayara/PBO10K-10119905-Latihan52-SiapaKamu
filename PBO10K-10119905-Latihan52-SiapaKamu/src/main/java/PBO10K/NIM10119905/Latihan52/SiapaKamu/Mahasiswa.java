/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan52.SiapaKamu;

/**
 *
 * @author aruma
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("sedang belajar di kelas PBO2");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
}
