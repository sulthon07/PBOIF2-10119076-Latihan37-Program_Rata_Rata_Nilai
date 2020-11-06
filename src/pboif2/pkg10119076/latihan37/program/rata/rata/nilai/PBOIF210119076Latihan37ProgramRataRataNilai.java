/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan37.program.rata.rata.nilai;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Program Rata rata Nilai
 */
public class PBOIF210119076Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.inputNilai();
        nilai.nilaiMahasiswa();
        System.out.println("Maka, Rata-rata Nilainya adalah : " + nilai.rataRataNilai());
    }
    
}
