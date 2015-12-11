/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.model;

/**
 *
 * @author ekky
 */
public class Menu {
   private int idMenu ;
   private String namaMenu;
   private String jenis;
   private int idKategori;
   private int stok;


    public Menu(int idMenu, String namaMenu, String jenis, int idKategori, int stok) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.jenis = jenis;
        this.idKategori = idKategori;
        this.stok = stok;
    }

   

    public Menu() {
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }
    
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
   
    
}
