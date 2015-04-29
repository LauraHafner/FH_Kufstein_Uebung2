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

 public class Mensch extends Saeugetier
 {
    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override
   public String printAll()
   {
       return name + " # " + alter + " # " + geschlecht;
   }
   
   public static void main(String[] args)
   {
       Mensch a = new Mensch("Laura", 19, "weiblich");
       System.out.println(a.printAll());
   }
      
}