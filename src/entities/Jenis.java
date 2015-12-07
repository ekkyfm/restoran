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
public class Jenis {
    private int idJenis;
    private String namaJenis;

    public Jenis(int idJenis, String namaJenis) {
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }
    
}
