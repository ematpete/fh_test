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
public class Fahrzeug 
{

    public Fahrzeug(short r, String f, short p, short t) 
    {
        Reifen = r;
        Farbe = f;
        PS = p;
        Tueren = t;
        
        
        Anzahl = Anzahl++;
    }
    
    private short Reifen;
    private String Farbe;
    private short PS;
    private int Tueren;
    private boolean Gestartet = false;
    private short Geschwindigkeit = 0;
    public static int Anzahl = 0;

    public short getReifen() 
    {
        return Reifen;
    }

    public void setReifen(short Reifen) 
    {
        this.Reifen = Reifen;
    }

    public String getFarbe() 
    {
        return Farbe;
    }

    public void setFarbe(String Farbe) 
    {
        this.Farbe = Farbe;
    }

    public short getPS() 
    {
        return PS;
    }

    public void setPS(short PS) 
    {
        this.PS = PS;
    }

    public int getTueren() 
    {
        return Tueren;
    }

    public void setTueren(int Tueren) 
    {
        this.Tueren = Tueren;
    }

    public boolean getGestartet() 
    {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) 
    {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() 
    {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) 
    {
        this.Geschwindigkeit = Geschwindigkeit;
    }
    
    public int getAnzahl()
    {
        return Anzahl;
    }
    
    
    
    
    public void starten()
    {
        Gestartet = true;
    }
    public void stoppen()
    {
        Gestartet = false;
    }
    void beschleunigen (short g)
    {
        if (Gestartet == true)
        {
        Geschwindigkeit += g;
            
            if(Geschwindigkeit > 250)
            {
             Geschwindigkeit = 250;
            }
        }
        else
        {
            System.out.println("Das Auto ist nicht gestartet");
        }
    }
    void bremsen (short g)
    {
        if (Gestartet == true)
        {
        Geschwindigkeit -= g;
            
            if(Geschwindigkeit < 0)
            {
             Geschwindigkeit = 0;
            }
        }
        else
        {
            System.out.println("Das Auto ist nicht gestartet");
        }
    }
    
}
