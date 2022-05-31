/*
* File: Munka.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/


package models;

public class Munka {
    
    public int id;
    public String beoszt;
    public int beosztId;
    
    public Munka(int id, String beoszt, int beosztId) {
        this.id = id;
        this.beoszt = beoszt;
        this.beosztId = beosztId;
    }
    
}
