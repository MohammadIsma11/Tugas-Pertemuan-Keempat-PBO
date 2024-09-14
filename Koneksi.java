/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEmpat;

import java.sql.*;

/**
 *
 * @author ISMAIL
 */
public class Koneksi {
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/uinsa", "postgres", "isma111004");
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
