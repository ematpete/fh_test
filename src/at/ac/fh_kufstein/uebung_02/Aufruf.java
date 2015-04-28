/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02;

import at.ac.fh_kufstein.uebung_02.Classes.Auto;
import at.ac.fh_kufstein.uebung_02.Classes.Farbe;
import at.ac.fh_kufstein.uebung_02.Classes.Mensch;
import at.ac.fh_kufstein.uebung_02.Classes.Mensch1;
import at.ac.fh_kufstein.uebung_02.Classes.Student;
import at.ac.fh_kufstein.uebung_02.Classes.Wasserfahrzeug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Peter
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Auto bmw = new Auto ((short)4, Farbe.silver, (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, Farbe.black, (short)180, (short)5, (short)8);
        Auto audi2 = new Auto ((short)4, Farbe.red, (short)190, (short)3, (short)5);
        Auto audi3 = new Auto ((short)4, Farbe.white, (short)310, (short)5, (short)7);
        Auto audi4 = new Auto ((short)4, Farbe.blue, (short)120, (short)3, (short)8);
        Wasserfahrzeug titanic = new Wasserfahrzeug ((short)0, Farbe.black, (short)51000, (short)0, (double)10.54,(short)3, (double)100000 );
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        
        Mensch hans = new Mensch ("Hans", 45, 'M');
        System.out.println(hans.printAll());
        
        Mensch1 karl = new Mensch1 ("Karl", "Gruber", 23);
        Student s1 = new Student ("Tobias", "Mayer", 24, 234234,"WEB");
        karl.Status();
        s1.Status();
        
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);
        
        for(Auto a : liste)
        {
            System.out.println(a.toString());
        }
    }
}
