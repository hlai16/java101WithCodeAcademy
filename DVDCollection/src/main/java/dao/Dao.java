/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import dto.DVD;
import java.util.List;

/**
 *
 * @author glori
 */
public interface Dao {
    DVD addDVD(String title, DVD dvd) throws DaoException;
    
    List<DVD> getAllDVDs() throws DaoException;
    
    DVD getDVD(String title) throws DaoException;
    
    DVD removeDVD(String title) throws DaoException;
    
//    DVD editDVD(String title, DVD dvd);
}
