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
class LUCY extends Personaje
{
    static boolean vida;
     public LUCY()
    {
        super("LUCY",200,40,30,0.5,"GOLPE MORTAL");
    }
    
    public void Ataque_siniestro()
    {
        Random r = new Random();
        int a = r.nextInt(100);
        if(a>70&& this.getSalud()<=15)
        {
            int _ataque = super.getAtaque();
            _ataque+=2;
            super.setAtaque(_ataque); 
            System.out.println("UN GOLPE MAS UN GOLPE MENOS SOY PODEROSAAAAAAA");
        }
    }

    @Override
    public void GANAR() 
    {
       System.out.println("victoriosos como siempre");
    }
    
    @Override
    public boolean vida()
    {
        boolean flag = true;
        
        if(this.getSalud()<=0) flag = false;
        
        return flag;
    }
    
    @Override
     public void ESTRATEGIA()
    {
        System.out.println(this.getNombre()+ " evito el golpe con exito!");
    }
    
}

