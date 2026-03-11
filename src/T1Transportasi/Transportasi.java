/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Transportasi;

/**
 *
 * @author Asus
 */
public class Transportasi {
    String nama;
    String bahanBakar;

    // Constructor
    public Transportasi(String nama, String bahanBakar) {
        this.nama = nama;
        this.bahanBakar = bahanBakar;
    }

    // Method menampilkan info
    public void infoTransportasi() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Bahan Bakar    : " + bahanBakar);
    }
}
