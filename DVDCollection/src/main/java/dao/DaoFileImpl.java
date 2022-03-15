/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author glori
 */
public class DaoFileImpl implements Dao {
    private Map<String, DVD> dvds = new HashMap<>();

    @Override
    public DVD addDVD(String title, DVD dvd) {
        DVD newDVD = dvds.put(title, dvd);
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String title) {
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title) {
        DVD removedDVD = dvds.remove(title);
        return removedDVD;
    }

//    @Override
//    public DVD editDVD(String title, DVD dvd) {
//        DVD edittedDVD = dvds.remove(title);
//        edittedDVD = dvds.put(title, dvd);
//        return edittedDVD;
//    }
    
}
