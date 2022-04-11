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
public class panda extends Personaje
{

     public panda()
    {
        super("PANDA",150,50,20,0.5,"GOLPE MORTAL");
    }
    
    public void subir_Ataque()
    {
        Random r = new Random();
        int a = r.nextInt(100);
        if(a>70&& this.getSalud()<=15)
        {
            int _ataque = super.getAtaque();
            _ataque+=2;
            super.setAtaque(_ataque); 
            System.out.println("JAJAJAJA...TUS GOLPES ME DAN RISA");
        }
    }

     @Override
    public void GANAR() 
    {
       System.out.println("LOSER... OTRA VICTORIA MAS PARA WARTOWN");
    }
}
