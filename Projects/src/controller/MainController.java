/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author wiwat
 */
import componentAdmin.CategoryScrollPane;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
import view.*;

public class MainController {
    private Mainframe mainFrame;
    private MainLayout mainLayout;
    private sidePane navPanel;
//    private CategoryScrollPane contentPanel;
    private topPane topPanel;
    private topPaneRead topRead;
    private ReadCartoon ReadCar;
//    private AdminLayout adminLayout;
//    private AdminController adminCon;
    public MainController(){
        mainFrame = new Mainframe();
        mainLayout = new MainLayout();
        navPanel = new sidePane();
        topPanel = new topPane();
        topRead = new topPaneRead();
        ReadCar = new ReadCartoon();
//        contentPanel = new CategoryScrollPane();
        
        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainLayout);
        
        mainLayout.getNavPanel().setLayout(new BorderLayout());
        mainLayout.getNavPanel().add(navPanel);
        
        mainLayout.getTopPanel().setLayout(new BorderLayout());
        mainLayout.getTopPanel().add(topRead);
        
        mainLayout.getBodyPanel().setLayout(new BorderLayout());
        mainLayout.getBodyPanel().add(ReadCar);
        mainFrame.setVisible(true);
        
//        mainLayout.getBodyPanel().removeAll();
//        mainLayout.getBodyPanel().add(contentPanel);
//        mainFrame.revalidate();
//        mainFrame.repaint();
    }
}
