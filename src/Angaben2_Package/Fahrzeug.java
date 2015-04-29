/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Angaben2_Package;

/**
 *
 * @author laura
 */
public class Fahrzeug {

    private short reifen;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    public short getReifen() 
    {
        return reifen;
    }

    public void setReifen(short reifen) 
    {
        this.reifen = reifen;
    }

    public short getPs() 
    {
        return ps;
    }

    public void setPs(short ps) 
    {
        this.ps = ps;
    }

    public short getTueren() 
    {
        return tueren;
    }

    public void setTueren(short tueren) 
    {
        this.tueren = tueren;
    }

    public boolean isGestartet() 
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) 
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() 
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) 
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() 
    {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) 
    {
        Fahrzeug.anzahl = anzahl;
    }
    
       
    public void starten()
    {
        gestartet = true;
    }
    
    public void stoppen()
    {
        gestartet = true;
    }
    
     public void Beschleunigen(short g)
    {
        if(gestartet == true && geschwindigkeit <= 250)
        {
        geschwindigkeit+= geschwindigkeit + g;
        }
        else
        {
            System.out.println("Das Fahrzeug wurde nicht gestartet oder die Geschwindigkeit ist über 250");
        }
    }
    
    public void bremsen(short b)
    {
        if(gestartet == true && geschwindigkeit >= 0)
        {
        geschwindigkeit+= geschwindigkeit + b;
        }
        else
        {
            System.out.println("Das Fahrzeug wurde nicht gestartet oder die Geschwindigkeit ist über 250");
        }
    }

    public Fahrzeug(short reifen, short ps, short tueren, boolean gestartet, short geschwindigkeit) {
        this.reifen = reifen;
      
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
    }
    
    
    
    
}
