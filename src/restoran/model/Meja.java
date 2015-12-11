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
public class Meja {
    private int noMeja;
    private String posisi;
    private String lantai;
    private int kapasitas;
    private String status;

    public Meja() {
    }

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getLantai() {
        return lantai;
    }

    public void setLantai(String lantai) {
        this.lantai = lantai;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
