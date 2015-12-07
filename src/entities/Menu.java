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
public class Menu {
    private int noMenu;
    private String namaMenu;
    private int idJenis;
    private int idKategori;
    private String gambar;

    public Menu() {
    }

    public Menu(int noMenu, String namaMenu, int idJenis, int idKategori, String gambar) {
        this.noMenu = noMenu;
        this.namaMenu = namaMenu;
        this.idJenis = idJenis;
        this.idKategori = idKategori;
        this.gambar = gambar;
    }

    public Menu(String namaMenu, int idJenis, int idKategori, String gambar) {
        this.namaMenu = namaMenu;
        this.idJenis = idJenis;
        this.idKategori = idKategori;
        this.gambar = gambar;
    }

    public int getNoMenu() {
        return noMenu;
    }

    public void setNoMenu(int noMenu) {
        this.noMenu = noMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    
}
