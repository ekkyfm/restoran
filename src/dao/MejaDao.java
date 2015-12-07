/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import entities.*;
import java.sql.*;
/**
 *
 * @author ekky
 */
public class MejaDao {

    public List<Meja> findAll(){
        try {
            List<Meja> listTables = new ArrayList<>();
            PreparedStatement ps =  ConnectDB.getConnection().prepareStatement("select * from table");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Meja t = new Meja();
                t.setNoMeja(rs.getInt("no_nomer"));
                t.setLantai(rs.getString("lantai"));
                t.setPosisi(rs.getString("posisi"));
                t.setStatus(rs.getString("status"));
                listTables.add(t);
            }
            return listTables;
       } catch (Exception e) {
            return null;
       }
    }
    
    public Meja find(int table_number){
        try {
            Meja t = new Meja();
            PreparedStatement ps =  ConnectDB.getConnection().prepareStatement("select * from table where table_number=?");
            ps.setInt(1, table_number);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                t.setNoMeja(rs.getInt("no_nomer"));
                t.setLantai(rs.getString("lantai"));
                t.setPosisi(rs.getString("posisi"));
                t.setStatus(rs.getString("status"));
            }
            return t;
       } catch (Exception e) {
            return null;
       }
    }
    
    public boolean create(Meja t){
        try {
             PreparedStatement ps =  ConnectDB.getConnection().prepareStatement("insert into table values(?,?,?,?,?)");
             ps.setInt(1, t.getNoMeja());
             ps.setString(2, t.getPosisi());
             ps.setString(3, t.getStatus());
             ps.setString(4, t.getLantai());
             ps.setInt(5, t.getKapasitas());
             return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(int table_number){
        try {
            PreparedStatement ps =  ConnectDB.getConnection().prepareStatement("delete from table where table_number = ?");
            ps.setInt(1, table_number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean edit(Meja t, int tableNumber){
        try {
            PreparedStatement ps =  ConnectDB.getConnection().prepareStatement("update table set  position = ?, status = ? where table_number = ?");
            ps.setString(2, t.getPosisi());
            ps.setString(3, t.getStatus());
            ps.setString(4, t.getLantai());
            ps.setInt(5, t.getKapasitas());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
