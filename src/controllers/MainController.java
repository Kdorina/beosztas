/*
* File: MainController.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/



package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Kovács Dorina");
        this.mainModel.groupList.forEach(beosztas -> {
        this.mainFrame.groupModel.addElement(beosztas.beoszt);
      
        });
      this.setEvents();
    }

    private void setEvents(){
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    }
    private void onActionGroupCombo(){
       int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedBeosztId = index;
        this.mainFrame.munkaModel.clear();
        this.mainModel.munkaLista.forEach(munka -> {

            System.out.println(munka.beosztId);

            if(selectedBeosztId == munka.beosztId){
                this.mainFrame.munkaModel.addElement(munka.beoszt);

            }
        });
    }
}
