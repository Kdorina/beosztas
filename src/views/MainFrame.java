/*
* File: MainFrame.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/


package views;

import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    public DefaultComboBoxModel<String> beosztModel;
    public JComboBox<String> beosztCombo;

    public DefaultListModel<String> beosztasModel;
    public JList<String> beosztLista;
    JScrollPane scrollPane;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {

        this.beosztModel = new DefaultComboBoxModel<>();
        this.beosztCombo = new JComboBox<>(this.beosztModel);

        this.beosztasModel = new  DefaultListModel<>();
        this.beosztLista = new JList<>(this.beosztasModel);
        this.scrollPane = new JScrollPane(this.beosztLista);
        
        
    }
    private void setMainPanel() {
     
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.beosztCombo, BorderLayout.NORTH);
        this.mainPanel.add(this.scrollPane, BorderLayout.CENTER);
        


    }
    private void setMainFrame() {

        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
