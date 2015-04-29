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
public class Student extends Menschen
{
    String matrikelnummer;
    String studiengang;
    
    public Student(String vorname, String nachname, int alter, String matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um den Studenten " + vorname + " " + nachname + " " + alter + " " + matrikelnummer + " " + studiengang);
    }
    
    public static void main(String[] args)
    {
    Menschen laura = new Menschen("Laura", "Hafner", 19);
    laura.Status();
    
    laura = new Student("Laura", "Hafner", 19, "1410653688", "Web Business & Technology");
    laura.Status();
    }
}

