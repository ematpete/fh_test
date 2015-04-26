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
public class Wasserfahrzeug extends Fahrzeug 
{

    public Wasserfahrzeug(short r, String f, short p, short t, double ti, short s, double l) 
    {
        super(r, f, p, t);
        Tiefgang = ti;
        Schrauben = s;
        Ladung = l;
    }
    
    private double Tiefgang;
    private short Schrauben;
    private double Ladung;

    public double getTiefgang() 
    {
        return Tiefgang;
    }

    public void setTiefgang(double Tiefgang) 
    {
        this.Tiefgang = Tiefgang;
    }

    public short getSchrauben() 
    {
        return Schrauben;
    }

    public void setSchrauben(short Schrauben) 
    {
        this.Schrauben = Schrauben;
    }

    public double getLadung() 
    {
        return Ladung;
    }

    public void setLadung(double Ladung) 
    {
        this.Ladung = Ladung;
    }
    
    void entladen() throws InterruptedException
    {
        Ladung = 0;
        Thread.sleep(5000);
    }
    
    
        @Override
    public String toString()
    {
        return "Mein Wasserfahrzeug hat "+this.getPS()+" PS und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }
    
}
