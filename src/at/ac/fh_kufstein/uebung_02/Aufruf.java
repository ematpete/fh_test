/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02;

import at.ac.fh_kufstein.uebung_02.Classes.Auto;
import at.ac.fh_kufstein.uebung_02.Classes.Wasserfahrzeug;

/**
 *
 * @author Peter
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Auto bmw = new Auto ((short)4, "silber", (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, "schwarz", (short)180, (short)5, (short)8);
        Wasserfahrzeug titanic = new Wasserfahrzeug ((short)0, "blau", (short)51000, (short)0, (double)10.54,(short)3, (double)100000 );
        
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
    }
}
