/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Angaben_Package;

/**
 *
 * @author laura
 */
public class Menschen
{    
    String vorname;
    String nachname;
    int alter;
    
public Menschen(String vorname, String nachname, int alter)
{
this.vorname = vorname;
this.nachname = nachname;
this.alter = alter;
}

public void Status()
{
    System.out.println("Es handelt sich um einen Mensch: " + vorname + " " + nachname + " " + alter);
}
}

