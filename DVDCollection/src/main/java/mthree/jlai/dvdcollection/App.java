/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.jlai.dvdcollection;

import controller.Controller;
import dao.Dao;
import dao.DaoFileImpl;
import ui.UserIO;
import ui.UserIOConsoleImpl;
import ui.View;

/**
 *
 * @author glori
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        View myView = new View(myIo);
        Dao myDao = new DaoFileImpl();
        Controller controller = new Controller(myDao, myView);
        controller.run();
    }
}
