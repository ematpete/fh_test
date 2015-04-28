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
public class Student extends Mensch1
{

    public Student(String Vorname, String Nachname, int Alter, int Matrikelnummer, String Studiengang) 
    {
        super(Vorname, Nachname, Alter);
        
        this.Matrikelnummer = Matrikelnummer;
        this.Studiengang = Studiengang;
    }
    private int Matrikelnummer;
    private String Studiengang;

    @Override
    public void Status() 
    {
         System.out.println("Es handelt sich um den Studenten "+this.getVorname()+" "+this.getNachname()+", mit "+this.getAlter()+" Jahren");
    }
    
    
    
}
