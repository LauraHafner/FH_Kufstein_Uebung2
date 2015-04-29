/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufruf;

import Angaben2_Package.Auto;
import Angaben2_Package.Auto.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author laura
 */
public class Aufruf_Package {
    public static void main(String[] args)
    {
      
        Auto bmw = new Auto ((short) 4, (short)4, (short)220, (short)5, (short)0, color.Black);
        Auto audi = new Auto ((short) 8, (short) 4, (short) 180, (short) 5, (short) 0, color.Blue);
        Auto porsche = new Auto ((short) 8, (short) 4, (short) 160, (short) 5, (short) 0, color.Red);
        Auto vw = new Auto ((short) 8, (short) 4, (short) 90, (short) 5, (short) 0, color.Silver);
        Auto ferrari = new Auto ((short) 8, (short) 4, (short) 70, (short) 5, (short) 0, color.Blue);
       
        List<Auto> l = new ArrayList<>();
        l.add(vw);
        l.add(porsche);
        l.add(bmw);
        l.add(audi);
        l.add(ferrari);
        
        Collections.sort(l);
        l.stream().forEach((a) -> {
            System.out.println(a.getPs());
        });   
    }
}
