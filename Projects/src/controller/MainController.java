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

public class MainController {
    private Mainframe mainFrame;
    private MainLayout mainLayout;
    private sidePane navPanel;
    private CategoryScrollPane contentPanel;
    private topPane topPanel;
    private AdminLayout adminLayout;
    private AdminController adminCon;
    public MainController(){
        mainFrame = new Mainframe();
        mainLayout = new MainLayout();
        navPanel = new sidePane();
        contentPanel = new CategoryScrollPane();
        
        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainLayout);
        
        mainLayout.getNavPanel().setLayout(new BorderLayout());
        mainLayout.getNavPanel().add(navPanel);
        
        mainLayout.getTopPanel().setLayout(new BorderLayout());
        mainLayout.getTopPanel().add(topPanel);
        
        mainLayout.getBodyPanel().setLayout(new BorderLayout());
        mainLayout.getBodyPanel().add(adminLayout);
        mainFrame.setVisible(true);
        
//        mainLayout.getBodyPanel().removeAll();
//        mainLayout.getBodyPanel().add(contentPanel);
//        mainFrame.revalidate();
//        mainFrame.repaint();
    }
}
