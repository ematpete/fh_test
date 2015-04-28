/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author Peter
 */
public abstract class Säugetier 
{

    public Säugetier(String Name, int Alter, char Geschlecht) 
    {
        this.Name = Name;
        this.Alter = Alter;
        this.Geschlecht = Geschlecht;
    }
    private String Name;
    private int Alter;
    private char Geschlecht;
    
    public abstract String printAll();
    
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int Alter) {
        this.Alter = Alter;
    }

    public char getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(char Geschlecht) {
        this.Geschlecht = Geschlecht;
    }
    
    

  
}
