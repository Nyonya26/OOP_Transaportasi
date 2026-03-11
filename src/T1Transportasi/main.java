/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Transportasi;

/**
 *
 * @author Asus
 */
public class main {

    public static void main(String[] args) {

        // Membuat objek motor
        motor motorSaya = new motor("Honda Supra", "Bensin", 2,110);

        System.out.println("=== INFORMASI KENDARAAN ===");

        motorSaya.infomotor();
        motorSaya.berjalan();
    }
}