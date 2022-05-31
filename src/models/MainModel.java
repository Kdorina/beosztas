/*
* File: MainModel.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/



package models;
import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    public Beosztas[] BeosztasArray =  {

        new Beosztas(1,"Fejlesztő"),
        new Beosztas(2,"Eladó"),
        new Beosztas(3,"Programozó"),
        new Beosztas(4,"Takaritó"),
        new Beosztas(5,"Vezető"),
        new Beosztas(6,"Gyakornok"),
        new Beosztas(7,"Mérnök"),
        new Beosztas(8,"Szerelő"),
        new Beosztas(9,"Mosogató"),
        new Beosztas(10,"Asztalos")
    };
 public Vector<Beosztas>groupList = new Vector<>(Arrays.asList(BeosztasArray));

        public Munka[] munkaArray = {

            new Munka(1, "Pala Sándor", 1),
            new Munka(2, "Alga Irén", 2),
            new Munka(3, "Rota Valér", 6),
            new Munka(4, "Siku Ferenc", 5),
            new Munka(5, "Hari Béla", 4),
            new Munka(6, "Közle Mihály", 7),
            new Munka(7, "Csont Emőke", 9),
            new Munka(8, "Ete Levente", 10),
            new Munka(9, "Erős István", 8),
            new Munka(9, "Erős Pista", 3)
    
        };
        public Vector<Munka> munkaLista = new Vector<>(Arrays.asList(munkaArray));
    }
    