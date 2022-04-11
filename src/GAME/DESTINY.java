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
public class DESTINY extends Personaje
{
    public DESTINY()
    {
        super();
        this.saludTotal = this.getSalud();
    }
    
    public void perdida_Critica()
    {
        System.out.println("HE TENIDO UN ATAQUE");
    }
    private int saludTotal;
    public void recuperar_Vida()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(((double)this.getSalud()/(double)this.saludTotal)<=0.5 && a<25){
            int salud = this.getSalud();
            salud +=10;
            this.setSalud(salud);
            System.out.println("DESTINY: Jajaja... Si que eres debil");
            System.out.println("DESINY: Tus golpes me ayudan"); 
        }
        //else{
            
        //}
    }

    @Override
       public void ATAQUES(int _ataque)
    {
        int vida_Restante=this.getSalud();
        int perdida = _ataque-this.getDefensa();
        if(perdida>0)
        {
            vida_Restante-=perdida;
            if(((double)this.getSalud()/(double)this.saludTotal)<=0.2) perdida_Critica();
            System.out.println(this.getNombre() + " ha recibido un golpe... Ha perdido "+perdida+" vida");
            
        }else{
            System.out.println(this.getNombre()+" se ha librado de un golpe... Se prepara para atacar");
        }
        if(vida_Restante<0) vida_Restante=0;
        this.setSalud(vida_Restante);
        System.out.println("La vida de "+ this.getNombre()+" es de" +this.getSalud());
    }

    @Override
    public void GANAR() 
    {
        System.out.println("OTRA VICTORIA PARA EL LADO CORRECTO");
    }
        
}
