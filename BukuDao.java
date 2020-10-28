/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomodel;

import dao.Dao;
import database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Buku;

/**
 *
 * @author Andika Sundawijaya
 */
public class BukuDao implements Dao<Buku> {

    @Override
    public List<Buku> getAll() {
        String sql = "SELECT * FROM buku";
        List<Buku> listBuku = new ArrayList<>();
        ResultSet rs;
        
        try {
            Statement stmt = DatabaseConnection.getConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int idBuku = rs.getInt("id_buku");
                String judul = rs.getString("judul");
                String pengarang = rs.getString("pengarang");

                Buku buku = new Buku(idBuku, judul, pengarang);
                listBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBuku;
    }

    @Override
    public void save(Buku t) {
        String sql = "INSERT INTO buku (judul, pengarang) VALUES (?,?)";

        try {

            PreparedStatement pstmt = DatabaseConnection.getConnection().
               prepareStatement(sql);
            pstmt.setString(1, t.getJudul());
            pstmt.setString(2, t.getPengarang());
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Buku t) {
        String sql = "UPDATE buku SET judul=?, pengarang=? WHERE id_buku=?";

        try {

            PreparedStatement pstmt = DatabaseConnection.getConnection().
                    prepareStatement(sql);
            pstmt.setString(1, t.getJudul());
            pstmt.setString(2, t.getPengarang());
            pstmt.setInt(3, t.getIdBuku());

            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Buku t) {
        String sql = "DELETE FROM buku WHERE id_Buku =?";

        try {
            PreparedStatement pstmt = DatabaseConnection.getConnection().
                    prepareStatement(sql);
            
            //punya zip dari bapak
//            pstmt.setString(1, t.getJudul());
//            pstmt.setString(2, t.getPengarang());
//            pstmt.setInt(3, t.getIdBuku());

            //perubahan dari saya
            pstmt.setInt(1, t.getIdBuku());
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
