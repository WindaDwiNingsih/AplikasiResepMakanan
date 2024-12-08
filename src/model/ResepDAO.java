/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class ResepDAO {
    // Method untuk mengambil semua data resep di tabel
    public List<Resep> getAllReseps() throws SQLException {
        List<Resep> resep = new ArrayList<>();
        String sql = "SELECT * FROM resep";
        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Resep rsp = new Resep(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("bahan"),
                    rs.getString("kategori"),
                    rs.getString("masak"));
                resep.add(rsp);
            }
        }
        return resep;
    }
    // Method untuk menambahkan resep ke tabel
    public void addResep(Resep rsp) throws SQLException {
        String sql = "INSERT INTO resep (nama, bahan, kategori,masak) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, rsp.getNama());
            pstmt.setString(2, rsp.getBahan());
            pstmt.setString(3, rsp.getKategori());
            pstmt.setString(4, rsp.getMasak());
            pstmt.executeUpdate();
        }
    }
    // Method untuk mengupdate resep ke tabel
    public void updateResep(Resep rsp) throws SQLException {
        String sql = "UPDATE resep SET nama = ?, bahan = ?, kategori = ?, masak =? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, rsp.getNama());
            pstmt.setString(2, rsp.getBahan());
            pstmt.setString(3, rsp.getKategori());
            pstmt.setString(4, rsp.getMasak());
            pstmt.setInt(5, rsp.getId());
            pstmt.executeUpdate();
        }
    }
    // Method untuk menghapus resep di tabel
    public void deleteResep(int rspId) throws SQLException {
        String sql = "DELETE FROM resep WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, rspId);
            pstmt.executeUpdate();  
        }
    }
    
    // Method untuk mencari resep di tabel
    public List<Resep> searchReseps(String keyword) throws SQLException {
        List<Resep> rsps = new ArrayList<>();
        String sql = "SELECT * FROM resep WHERE nama LIKE ? OR bahan LIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Resep rsp = new Resep(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("bahan"),
                    rs.getString("kategori"),
                    rs.getString("masak"));
                rsps.add(rsp);
            }
        }
        return rsps;
    }
    
}    