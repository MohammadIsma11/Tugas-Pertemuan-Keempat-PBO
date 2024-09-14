/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEmpat;

/**
 *
 * @author ISMAIL
 */
public class ThrowsTryCatch {
    // Method 1: Menangani pengecualian NegativeArraySizeException menggunakan try-catch sendiri
    public static void buatArrayDenganTryCatch(int size) {
        try {
            int[] array = new int[size];
            System.out.println("Array berhasil dibuat dengan ukuran: " + size);
        } catch (NegativeArraySizeException e) {
            System.err.println("Kesalahan dari method try-catch sendiri: Ukuran array tidak boleh negatif.");
        }
    }

    // Method 2: Melempar pengecualian NegativeArraySizeException menggunakan throws
    public static void buatArrayDenganThrows(int size) throws NegativeArraySizeException {
        int[] array = new int[size];
        System.out.println("Array berhasil dibuat dengan ukuran: " + size);
    }

    public static void main(String[] args) {
        // 1. Memanggil method dengan try-catch sendiri
        buatArrayDenganTryCatch(-5);  // Ukuran negatif, pengecualian ditangani di dalam method

        // 2. Memanggil method yang menggunakan throws dan menangkap pengecualian di main
        try {
            buatArrayDenganThrows(-10);  // Ukuran negatif, pengecualian dilempar ke main
        } catch (NegativeArraySizeException e) {
            // Menangkap pengecualian dan menampilkan pesan kesalahan
            System.err.println("Kesalahan dari method throws yang ditangkap di main: Ukuran array tidak boleh negatif.");
        }

        System.out.println("Program selesai.");
    }
}
