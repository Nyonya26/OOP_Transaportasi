/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;
public class Data_Mobil {
    // Atribut dengan akses package-private (~)
    String platNomor;
    String merkMobil;
    String warna;
    int tahunProduksi;

    // Konstruktor (+)
    public Data_Mobil(String plat, String merk, String warna, int tahun) {
        this.platNomor = plat;
        this.merkMobil = merk;
        this.warna = warna;
        this.tahunProduksi = tahun;
    }
}


