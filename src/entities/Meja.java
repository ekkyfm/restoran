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
public class Meja {

    
    private int noMeja;
    private String posisi;
    private String status;
    private String lantai;
    private int kapasitas;
    
    
    public Meja() {
    }

    public Meja(int noMeja, String posisi, String status, String lantai, int kapasitas) {
        this.noMeja = noMeja;
        this.posisi = posisi;
        this.status = status;
        this.lantai = lantai;
        this.kapasitas = kapasitas;
    }

    public Meja(String posisi, String status, String lantai, int kapasitas) {
        this.posisi = posisi;
        this.status = status;
        this.lantai = lantai;
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLantai() {
        return lantai;
    }

    public void setLantai(String lantai) {
        this.lantai = lantai;
    }
    
    



   
    
}
