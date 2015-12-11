/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.dao;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import restoran.model.Meja;



/**
 *
 * @author ekky
 */
public class MejaDao {
    private Connection connection;
    public MejaDao() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran",
                    "root", "root");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void insertMeja(Meja meja) {
        String insert = "insert into meja(no_meja,posisi,lantai,kapasitas)"
            + " values(?,?,?,?)";
        PreparedStatement insertStatement = null;
        try {
            insertStatement = connection.prepareStatement(insert);

            insertStatement.setInt(0, meja.getNoMeja());
            insertStatement.setString(1, meja.getPosisi());
            insertStatement.setString(2, meja.getLantai());
            insertStatement.setInt(3, meja.getKapasitas());

            insertStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void updateMeja(Meja meja) {
        String update = "update meja set posisi=?,lantai=?, kapasitas=?, status = ?"
            + " where no_meja=?";
        PreparedStatement updateStatement = null;
        try {
            updateStatement = connection.prepareStatement(update);
            updateStatement.setString(0, meja.getPosisi());
            updateStatement.setString(1, meja.getLantai());
            updateStatement.setInt(2, meja.getKapasitas());
            updateStatement.setString(3, meja.getStatus());
            updateStatement.setInt(4, meja.getNoMeja());
            updateStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteMeja(Meja meja) {
        
        String delete = "delete from meja where no_meja=?";
        PreparedStatement deleteStatement = null;
        try {
            deleteStatement = connection.prepareStatement(delete);
            deleteStatement.setInt(0, meja.getNoMeja());
            deleteStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Meja> selectAll() {
        Statement selectAllStatement = null;
        List<Meja> listMeja = new ArrayList<Meja>();
        String selectAll = "select * from meja";
        try {
            selectAllStatement = connection.createStatement();

            ResultSet rs = selectAllStatement.executeQuery(selectAll);
            while (rs.next()) {
                Meja meja = new Meja();
                meja.setNoMeja(rs.getInt("no_meja"));
                meja.setKapasitas(rs.getInt("kapasitas"));
                meja.setLantai(rs.getString("lantai"));
                meja.setPosisi(rs.getString("posisi"));
                listMeja.add(meja);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listMeja;


    }

    public Meja searchMeja(Meja meja) {
        PreparedStatement searchStatement = null;
        Meja found = new Meja();
        try {
            String search = "select * from meja where no_meja=?";

            searchStatement = connection.prepareStatement(search);
            searchStatement.setInt(1, meja.getNoMeja());
            ResultSet rs = searchStatement.executeQuery();
            rs.next();
                found.setNoMeja(rs.getInt("no_meja"));
                found.setKapasitas(rs.getInt("kapasitas"));
                found.setLantai(rs.getString("lantai"));
                found.setPosisi(rs.getString("posisi"));

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return found;

    }
}
