/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dto.DVD;
import java.util.List;

/**
 *
 * @author glori
 */
public class View {
    private UserIO io = new UserIOConsoleImpl();
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Create New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Edit a DVD");
        
        io.print("6. Exit DVD Database");
        
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    //Add new DVD:
    public DVD getNewDVDInfo() {
        String title = io.readString("Please enter DVD title");
        String releasedDate = io.readString("Please enter DVD released date");
        int mpaa = io.readInt("Please enter DVD MPAA rating");
        String director = io.readString("Please enter the director of the DVD");
        String studio = io.readString("Please enter where the DVD published");
        String userRating = io.readString("Please enter your review of the DVD");
        
        DVD currentDVD = new DVD(title);
        currentDVD.setReleasedDate(releasedDate);
        currentDVD.setMpaa(mpaa);
        currentDVD.setDirector(director);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        
        return currentDVD;
    }
    public void displayCreateDVDBanner() {
        io.print("=== DVD Created ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString("DVD entry successfully created. Please hit enter to continue");
    }
    
    //List all DVDs in database:
    public void displayDVDList(List<DVD>dvdList) {
        for (DVD currentDVD : dvdList) {
            String dvdInfo = String.format("%s : %s : %s : %s : %s : %s",
                    currentDVD.getTitle(),
                    currentDVD.getReleasedDate(),
                    currentDVD.getMpaa(),
                    currentDVD.getDirector(),
                    currentDVD.getStudio(),
                    currentDVD.getUserRating());
            
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayAllDVDsBanner() {
        io.print("=== DVD List ===");
    }
    
    // Search DVD by title:
    public void searchResultBanner() {
        io.print("=== Search Result ===");
    }
    public String getTitleChoice() {
        return io.readString("Please enter the DVD title of your choice.");
    }
    public void displaySearchResult(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle());
            
            io.print(dvd.getReleasedDate());
            
            io.printInt(dvd.getMpaa());
            io.print(dvd.getDirector());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue");
    }
    
    //removing DVD:
    public void displayRemovingDVDBanner() {
        io.print("=== DVD Removed from Database ==="); 
    }
    public void displayRemoveResult(DVD dvdRecord) {
        if (dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue");
    }
    
    //updating DVD:
    public void displayEdittingDVDBanner() {
        io.print("=== Updating DVD info ===");
    }
    public void successfullyUpdatedBanner() {
        io.readString("DVD successfully updated. Please hit enter to continue");
    }
//    public void displayUpdatingResult(DVD updatedDVD) {
//        if (updatedDVD != null) {
//            getNewDVDInfo();
//            
//        } else {
//            io.print("No such DVD.");
//        }
//        io.readString("Please hit enter to continue");
//        
//    }
}
