/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Transportasi;

/**
 *
 * @author Asus
 */
public class motor extends Transportasi {

    int jumlahRoda;
    int Kecepatan;

    // Constructor
    public motor(String nama, String bahanBakar, int jumlahRoda,int Kecepatan) {
        super(nama, bahanBakar);
        this.jumlahRoda = jumlahRoda;
        this.Kecepatan  = Kecepatan;
    }

    // Method info motor
    public void infomotor() {
        infoTransportasi();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
        System.out.println("Kecepatan      : " + Kecepatan );
    }

    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan di jalan raya.");
    }
}