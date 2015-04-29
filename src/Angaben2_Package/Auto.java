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
public class Auto extends Fahrzeug implements Comparable<Auto>
{    
    private boolean klimaanlage; 
    private short airbags;
    private color farbe;

    public enum color{
        Silver, Red, Black, Blue, White;
    }
    
    public Auto(short airbags, short reifen,  short ps, short tueren, short geschwindigkeit, color farbe) {
        super(reifen, ps, tueren, false, geschwindigkeit);
        this.klimaanlage = false;
        this.airbags = airbags;
        this.farbe = farbe;
        
       
        anzahl += 1;
    }
    
    public Auto(short airbags, short reifen,  short ps, short tueren, short geschwindigkeit) {
        this(airbags, reifen, ps, tueren, geschwindigkeit, color.Black);
    }
    

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    
  
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
    
    
    
    public void klimaanlageAn()
    {
        if(klimaanlage == true)
        {
            System.out.println("Klimaanlage läuft bereits");
        }
        else
        {
            klimaanlage = true;
        }
        
    }
    
    public void klimaanlageAus(){
        
       if(klimaanlage == true)
       {
           klimaanlage = false;
       }
       else
       {
           System.out.println("Die Klimaanlage ist bereits aus");
       }
    }

    

//    @Override
//    public String toString() {
//        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getGeschwindigkeit() + " km/h";
//    }

   @Override
    public int compareTo(Auto b) {
        
        if(this.getPs() < b.getPs())
        {
            return -1;
        }
        else if(this.getPs()>b.getPs())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
