/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Resep;
import model.ResepDAO;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author USER
 */
public class ResepController {
    private ResepDAO resepDAO;
    public ResepController() {
        resepDAO = new ResepDAO();
    }
    // Method mengambil semua data resep
    public List<Resep> getAllReseps() throws SQLException {
        return resepDAO.getAllReseps();
    }
    // Method menambah resep
    public void addResep(String nama, String bahan, String kategori, String masak)
    throws SQLException {
        Resep resep = new Resep(0, nama, bahan, kategori,masak);
    resepDAO.addResep(resep);
    }
    // Method mengupdate resep
    public void updateResep(int id, String nama, String bahan,
    String kategori, String masak) throws SQLException {
        Resep resep = new Resep(id, nama, bahan, kategori, masak);
    resepDAO.updateResep(resep);
    }
    // Method menghapus resep
    public void deleteResep(int id) throws SQLException {
        resepDAO.deleteResep(id);
    }
    // Method pencarian resep
    public List<Resep> searchReseps(String keyword) throws SQLException {
        return resepDAO.searchReseps(keyword);
    }
    
}
