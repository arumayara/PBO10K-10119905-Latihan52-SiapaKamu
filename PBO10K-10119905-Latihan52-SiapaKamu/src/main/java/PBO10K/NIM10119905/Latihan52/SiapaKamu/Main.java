/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan52.SiapaKamu;

/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Siapa Kamu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia objDosen;
        Manusia objMahasiswa;
        
        Dosen dosen = new Dosen();
        objDosen = new Dosen();
        objDosen.setNama("Rizki Adam Kurniawan");
        objDosen.setUmur(27);
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        objDosen.siapaKamu();
        System.out.print("Saya "+ objDosen.getNama()+" umur "+objDosen.getUmur()+" tahun ");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        objMahasiswa = new Mahasiswa();
        objMahasiswa.setNama("Nindi");
        objMahasiswa.setUmur(17);
        mahasiswa.setNim("10110269");
        System.out.println();
        System.out.println("NIM MAHASISWA : "+ mahasiswa.getNim());
        objMahasiswa.siapaKamu();
        System.out.print("Saya "+ objMahasiswa.getNama()+" umur "+objMahasiswa.getUmur()+ " tahun ");
        mahasiswa.kelasApa();
              
        
    }
    
}
