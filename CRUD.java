/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEmpat;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class CRUD {
    Koneksi kon = new Koneksi();
    Connection conn = kon.connect();
    
    public void insertMahasiswa(String nim, String nama, String alamat) {
        String sql = "INSERT INTO mahasiswa (nim, nama, alamat) VALUES (?, ?, ?)";

        try (Connection conn = kon.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nim);
            pstmt.setString(2, nama);
            pstmt.setString(3, alamat);
            pstmt.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk membaca semua data mahasiswa (Read)
    public void selectAllMahasiswa() {
        String sql = "SELECT * FROM mahasiswa";

        try (Connection conn = kon.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("NIM: " + rs.getString("nim"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("Alamat: " + rs.getString("alamat"));
                System.out.println("=================================");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk mengupdate data mahasiswa (Update)
    public void updateMahasiswa(String nim, String nama, String alamat) {
        String sql = "UPDATE mahasiswa SET nama = ?, alamat = ? WHERE nim = ?";

        try (Connection conn = kon.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nama);
            pstmt.setString(2, alamat);
            pstmt.setString(3, nim);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Data mahasiswa berhasil diupdate.");
            } else {
                System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menghapus data mahasiswa (Delete)
    public void deleteMahasiswa(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim = ?";

        try (Connection conn = kon.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nim);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Data mahasiswa berhasil dihapus.");
            } else {
                System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        CRUD app = new CRUD();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        String nim, nama, alamat;

        do {
            System.out.println("\n==== CRUD Mahasiswa ====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    alamat = scanner.nextLine();
                    app.insertMahasiswa(nim, nama, alamat);
                    break;
                case 2:
                    app.selectAllMahasiswa();
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan Nama baru: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat baru: ");
                    alamat = scanner.nextLine();
                    app.updateMahasiswa(nim, nama, alamat);
                    break;
                case 4:
                    System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                    nim = scanner.nextLine();
                    app.deleteMahasiswa(nim);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
    
}
