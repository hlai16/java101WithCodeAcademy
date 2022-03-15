/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Dao;
import dao.DaoFileImpl;
import dto.DVD;
import java.util.List;
import ui.UserIO;
import ui.UserIOConsoleImpl;
import ui.View;

/**
 *
 * @author glori
 */
public class Controller {
    private UserIO io = new UserIOConsoleImpl();
    private View view = new View();
    private Dao dao = new DaoFileImpl();
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            
            menuSelection = getMenuSelection();
            
            switch (menuSelection) {
                case 1:
                    listDVDs();
                    break;
                case 2:
                    createDVD();
                    break;
                case 3:
                    viewDVD();
                    break;
                case 4:
                    removeDVD();
                    break;
                case 5:
                    updateDVD();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                
                default:
                    io.print("INVALID ENTRY");
            }
        }
        io.print("GOOD BYE");
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createDVD() {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();
    }
    
    private void listDVDs() {
        view.displayAllDVDsBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }
    
    private void viewDVD() {
        view.searchResultBanner();
        String title = view.getTitleChoice();
        DVD dvd = dao.getDVD(title);
        view.displaySearchResult(dvd);
    }
    
    private void removeDVD() {
        view.displayRemovingDVDBanner();
        String title = view.getTitleChoice();
        DVD removedDVD = dao.removeDVD(title);
        view.displayRemoveResult(removedDVD);
    }
    
    public void updateDVD() {
        view.displayEdittingDVDBanner();
        String title = view.getTitleChoice();
        DVD updatedDVD = dao.removeDVD(title);
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.successfullyUpdatedBanner();
    }
}
