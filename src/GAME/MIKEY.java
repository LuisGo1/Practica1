/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GAME;

import java.util.Random;

/**
 *
 * @author Genesis
 */
public class MIKEY extends Personaje
{
    public MIKEY()
    {
       super("MIKEY",100,24,30,0.5,"GOLPE MORTAL");
    }
    
    public void GOLPE_TACTICO()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(a<10&& this.getSalud()>120)
        {
            int _defensa = super.getDefensa();
            _defensa-=2;
            super.setDefensa(_defensa);
            System.out.println("MIKE:MI ARMADURA, NOOOO...");
        }
        
    }

    @Override
    public void GANAR() 
    {
        System.out.println("MIKE:GANAMOS SOLDADO");
    }
   
}
    

