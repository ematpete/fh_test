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
public class Mensch extends Säugetier
{

    public Mensch(String Name, int Alter, char Geschlecht) 
    {
        super(Name, Alter, Geschlecht);
    }

    @Override
    public String printAll() 
    {
        return this.getName()+ "#" + this.getAlter()+ "#" + this.getGeschlecht(); 
    }
    
    
    
}
