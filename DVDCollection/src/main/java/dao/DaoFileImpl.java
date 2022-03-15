/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author glori
 */
public class DaoFileImpl implements Dao {
    public static final String DVD_FILE = "dvd.txt";
    public static final String DELIMITER = "::";
    
    private Map<String, DVD> dvds = new HashMap<>();
    
    // Unmarshalling...
    
    private DVD unmarshallDVD(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);
        String title = dvdTokens[0];
        
        DVD dvdFromFile = new DVD(title);
        dvdFromFile.setReleasedDate(dvdTokens[1]);
//        dvdFromFile.setMpaa(dvdTokens[2]);
        dvdFromFile.setDirector(dvdTokens[3]);
        dvdFromFile.setStudio(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);
        
        return dvdFromFile;
    }
    
    private void loadDVD() throws DaoException, FileNotFoundException {
        Scanner scanner;
        
        try {
            scanner = new Scanner(
                new BufferedReader(
                    new FileReader(DVD_FILE)));
        } catch (FileNotFoundException e) {
            throw new DaoException("Could not load DVD data into memory.", e);
        }
        
        String currentLine;
        DVD currentDVD = null;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentDVD = unmarshallDVD(currentLine);
            
            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        
        scanner.close();
    }
    
    //Marshalling...
    private String marshallDVD(DVD aDVD) {
        String dvdAsText = aDVD.getTitle() + DELIMITER;
        dvdAsText += aDVD.getReleasedDate() + DELIMITER;
        dvdAsText += aDVD.getDirector() + DELIMITER;
        dvdAsText += aDVD.getStudio() + DELIMITER;
        dvdAsText += aDVD.getUserRating();
        
        return dvdAsText;
    }
    
    private void writeDVD() throws DaoException, IOException {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(DVD_FILE));
        } catch (IOException e) {
            throw new DaoException("Could not save DVD data.", e);
        }
        
        String dvdAsText;
        List<DVD> dvdList = this.getAllDVDs();
        
        for (DVD currentDVD : dvdList) {
            dvdAsText = marshallDVD(currentDVD);
            
            out.println(dvdAsText);
            
            out.flush();
        }
        out.close();
    }

    @Override
    public DVD addDVD(String title, DVD dvd) throws DaoException {
        try {
            loadDVD();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        DVD newDVD = dvds.put(title, dvd);
        try {
            writeDVD();
        } catch (IOException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DaoException {
        try {
            loadDVD();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String title) throws DaoException {
        try {
            loadDVD();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title) throws DaoException {
        try {
            loadDVD();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        DVD removedDVD = dvds.remove(title);
        try {
            writeDVD();
        } catch (IOException ex) {
            Logger.getLogger(DaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return removedDVD;
    }

//    @Override
//    public DVD editDVD(String title, DVD dvd) {
//        DVD edittedDVD = dvds.remove(title);
//        edittedDVD = dvds.put(title, dvd);
//        return edittedDVD;
//    }
    
}
