/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan31.perkenalanmahasiswa;

/**
 * @author lenovo
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program dibuat unutuk menampilkan perkenalan mahasiswa
 *                     serta NIM dan Nama.
 */
public class PBO310117122Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa n = new Mahasiswa();
        n.nim  = "10110269";
        n.nama = "Rizki Adam Kurniawan";
        n.perkenalkanDiri(n.nim, n.nama);
        
        Mahasiswa n2 = new Mahasiswa();
        n2.nim  = "10110270";
        n2.nama = "Indra Tiola";
        n2.perkenalkanDiri(n2.nim, n2.nama);
        
        Mahasiswa n3 = new Mahasiswa();
        n3.nim  = "10110271";
        n3.nama = "Robi Tanzil Ganefi";
        n3.perkenalkanDiri(n3.nim, n3.nama);
        
        Mahasiswa n4 = new Mahasiswa();
        n4.nim  = "10110269";
        n4.nama = "Muhammad Nur Awaludin";
        n4.perkenalkanDiri(n4.nim, n4.nama);
        
         System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
