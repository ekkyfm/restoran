/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.controller;

import restoran.dao.MejaDao;
import restoran.model.Meja;

/**
 *
 * @author ekky
 */
public class MenuController {
    MejaDao accessObject = new MejaDao();
    public boolean save(Meja meja){
        try {
            accessObject.insertMeja(meja);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean update(Meja meja){
        try {
            accessObject.updateMeja(meja);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean delete(Meja meja){
        try {
            accessObject.deleteMeja(meja);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
      
    
}
