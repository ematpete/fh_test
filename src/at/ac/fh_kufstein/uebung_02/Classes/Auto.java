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
public class Auto extends Fahrzeug implements Comparable <Auto>
{

    public Auto(short r, Farbe f, short p, short t, short ai) 
    {
        super(r, f, p, t);
        Airbags = ai;
       
    }

    public Auto(short r, short p, short t, short Airbags) {
        super(r, Farbe.black, p, t);
        this.Airbags = Airbags;
    }

    
    
    
    
    private boolean Klimaanlage = false;
    private short Airbags;
    
    
    public boolean getKlimaanlage() 
    {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) 
    {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags()
    {
        return Airbags;
    }

    public void setAirbags(short Airbags) 
    {
        this.Airbags = Airbags;
    }
    
    
    void klimaanlageAn()
    {
        if(Klimaanlage == false)
        {
            Klimaanlage = true;
        }
        else
        {
            System.err.println("Klimaanlage läuft bereits");
        }
    }
    
    void klimaanlageAus()
    {
        if(Klimaanlage == true)
        {
            Klimaanlage = false;
        }
        else
        {
            System.err.println("Klimaanlage bereits aus");
        }
    }

    
    @Override
    public String toString()
    {
        return "Mein Auto hat "+this.getPS()+" PS und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }



    @Override
    public int compareTo(Auto t) 
    {
        if(this.getPS()==t.getPS())
        {
            return 0;
        }
        else if(this.getPS()<t.getPS())
        {
            return -1;        
        }
        else
        {
            return 1;
        }
    }
    
    
   
    
}
