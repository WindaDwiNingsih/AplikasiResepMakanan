/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Resep {
   private int id;
    private String nama;
    private String bahan;
    private String kategori;
    private String masak;
    public Resep(int id, String nama, String bahan, String kategori, String masak)
    {
        this.id = id;
        this.nama = nama;
        this.bahan = bahan;
        this.kategori = kategori;
        this.masak = masak;
    }
    // Getters dan setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getBahan() {
        return bahan;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    } 
    public String getMasak() {
        return masak;
    }
    public void setMasak(String masak) {
        this.masak = masak;
    } 
}
