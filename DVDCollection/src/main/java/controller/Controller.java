/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Dao;
import dao.DaoException;
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
//    private UserIO io = new UserIOConsoleImpl();
    private View view;
    private Dao dao;
    
    public Controller(Dao dao, View view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
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
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (DaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
        
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createDVD() throws DaoException {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();
    }
    
    private void listDVDs() throws DaoException {
        view.displayAllDVDsBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }
    
    private void viewDVD() throws DaoException {
        view.searchResultBanner();
        String title = view.getTitleChoice();
        DVD dvd = dao.getDVD(title);
        view.displaySearchResult(dvd);
    }
    
    private void removeDVD() throws DaoException {
        view.displayRemovingDVDBanner();
        String title = view.getTitleChoice();
        DVD removedDVD = dao.removeDVD(title);
        view.displayRemoveResult(removedDVD);
    }
    
    private void updateDVD() throws DaoException {
        view.displayEdittingDVDBanner();
        String title = view.getTitleChoice();
        DVD updatedDVD = dao.removeDVD(title);
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.successfullyUpdatedBanner();
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
