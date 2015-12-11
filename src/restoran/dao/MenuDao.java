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
import restoran.model.Menu;



/**
 *
 * @author ekky
 */
public class MenuDao {
    private Connection connection;
    public MenuDao() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran",
                    "root", "root");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void insert(Menu menu) {
        String insert = "insert into menu(id_menu,nama_menu,jenis,id_kategori)"
            + " values(?,?,?,?)";
        PreparedStatement insertStatement = null;
        try {
            insertStatement = connection.prepareStatement(insert);

            insertStatement.setInt(0, menu.getIdMenu());
            insertStatement.setString(1, menu.getNamaMenu());
            insertStatement.setString(2, menu.getJenis());
            insertStatement.setInt(3, menu.getIdKategori());

            insertStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void update(Menu menu) {
        String update = "update menu set nama_menu = ?,jenis = ?, id_kategori=?, stok=?"
            + " where no_meja=?";
        PreparedStatement Statement = null;
        try {
            Statement = connection.prepareStatement(update);
            Statement.setString(0, menu.getNamaMenu());
            Statement.setString(1, menu.getJenis());
            Statement.setInt(2, menu.getIdKategori());
            Statement.setInt(3, menu.getStok());
            
            Statement.setInt(4, menu.getIdMenu());

            Statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(Menu menu) {
        
        String delete = "delete from menu where id_menu=?";
        PreparedStatement deleteStatement = null;
        try {
            deleteStatement = connection.prepareStatement(delete);
            deleteStatement.setInt(0, menu.getIdMenu());
            deleteStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Menu> selectAll() {
        Statement selectAllStatement = null;
        List<Menu> listMenu = new ArrayList<Menu>();
        String selectAll = "select * from menu";
        try {
            selectAllStatement = connection.createStatement();

            ResultSet rs = selectAllStatement.executeQuery(selectAll);
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("id_menu"));
                menu.setNamaMenu(rs.getString("nama_menu"));
                menu.setJenis(rs.getString("jenis"));
                menu.setIdKategori(rs.getInt("id_kategori"));
                listMenu.add(menu);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listMenu;


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
