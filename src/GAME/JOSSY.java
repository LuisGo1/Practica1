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
public class JOSSY extends Personaje 
{
    static boolean vida;
     public JOSSY()
    {
        super("JOSSY",100,35,20,0.5,"GOLPE MORTAL");
    }
      public void mejorAtaque()
    {
        if(this.getSalud()<=10)
        {
            int ataque = this.getAtaque();
            ataque +=20;
            this.setAtaque(ataque);
            System.out.println("");
            System.out.println("");
        }
    }
    
    public void llenarVida()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(a>60&& this.getSalud()<=15)
        {
            int salud = this.getSalud();
            salud+=15;
            this.setSalud(salud);
            System.out.println("");
            System.out.println("");
        }
        
    }
    @Override
    public void GANAR() 
    {
       System.out.println("MUY DEBIL CONTRA UNA CHICA PODEROSA");
    }
    
    @Override
    public boolean vida()
    {
        boolean flag = true;
        
        if(this.getSalud()<=0) flag = false;
        
        return flag;
    }
    //POLIMORFISMO
    @Override
     public void ESTRATEGIA()
    {
        System.out.println(this.getNombre()+ " evito el golpe con exito!");
    }
}