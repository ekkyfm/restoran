/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ekky
 */
public class Kategori {
    private int noKategori;
    private int idJenis;
    private String namaKategori;

    public Kategori(int noKategori, int idJenis, String namaKategori) {
        this.noKategori = noKategori;
        this.idJenis = idJenis;
        this.namaKategori = namaKategori;
    }

    public Kategori() {
    }

    public Kategori(int idJenis, String namaKategori) {
        this.idJenis = idJenis;
        this.namaKategori = namaKategori;
    }

    public int getNoKategori() {
        return noKategori;
    }

    public void setNoKategori(int noKategori) {
        this.noKategori = noKategori;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
 
    
    
}
