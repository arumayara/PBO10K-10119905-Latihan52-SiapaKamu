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
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("sedang mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
