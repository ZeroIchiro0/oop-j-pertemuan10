/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg10;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ZeroIchiro0
 * Tgl: Selasa, 20 Mei 2025
 */

public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi cnn = new dbkoneksi();
        Statement st =  cnn.koneksi().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet res = st.executeQuery(sql);
        
        while (res.next()){
            System.out.println("NAMA  : " +res.getString("NAMA"));
            System.out.println("NIM   : " +res.getString("NIM"));
            System.out.println("PRODI : " +res.getString("PRODI"));
            System.out.println("ALAMAT: " +res.getString("ALAMAT"));
        }
                
            
        
    }
    
}
