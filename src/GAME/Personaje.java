/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GAME;

/**
 *
 * @author Genesis
 */
public abstract class Personaje
{
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private double ta=0.5;
    private String tipoAtaque="IMPACTO_OPONENTE";
    
    public Personaje()
    {
        this.setNombre("MIKEY");
        this.setSalud(100);
        this.setAtaque(24);
        this.setDefensa(30);
        this.setNombre("PANDA");
        this.setSalud(150);
        this.setAtaque(50);
        this.setDefensa(20);
        this.setNombre("LUCY");
        this.setSalud(200);
        this.setAtaque(40);
        this.setDefensa(30);
        this.setNombre("JOSSY");
        this.setSalud(100);
        this.setAtaque(35);
        this.setDefensa(20);
        this.setNombre("DESTINY");
        this.setSalud(100);
        this.setAtaque(50);
        this.setDefensa(20);
        
    }
    
    public Personaje(String _nombre, int _salud, int _ataque, int _defensa, double _ta, String _tipo)
    {
       this.nombre = _nombre;
       this.ataque = _ataque;
       this.salud = _salud;
       this.defensa = _defensa;
       this.ta = _ta;
       this.tipoAtaque = _tipo;
    }
    public void setNombre(String _nombre)
    {
        this.nombre = _nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setSalud(int _salud)
    {
        this.salud=_salud;
    }
    
    public int getSalud()
    {
        return this.salud;
    }
    
    public void setAtaque(int _ataque)
    {
        this.ataque = _ataque;
    }
    
    public int getAtaque()
    {
        return this.ataque;
    }
    
    public void setDefensa(int _defensa)
    {
        this.defensa = _defensa;
    }
    
    public int getDefensa()
    {
        return this.defensa;
    }
    
    public void setTa(double _ta)
    {
        this.ta = _ta;
    }
    
    public double getTa()
    {
        return this.ta;
    }
    
    public abstract void GANAR();
    
    public void ATAQUES(int _ataque)
    {
        int vidaRestante=this.getSalud();
        int PERDIDA_VIDA= _ataque-this.getDefensa();
        if(PERDIDA_VIDA>0)
        {
            vidaRestante-=PERDIDA_VIDA;
            System.out.println(this.getNombre() + " ha recibido un "+tipoAtaque+"... Ha perdido "+PERDIDA_VIDA+" vida");
            
        }else{
            System.out.println(this.getNombre()+" se ha librado de un "+tipoAtaque+"... Se prepara para atacar");
        }
        if(vidaRestante<0) vidaRestante=0;
        this.setSalud(vidaRestante);
        System.out.println("La vida de "+ this.getNombre()+" es de " +this.salud);
    }
    
    public void ESTRATEGIA()
    {
        System.out.println(this.getNombre()+ " evito el golpe con exito!");
    }
    
    public boolean vida()
    {
        boolean flag = true;
        
        if(this.getSalud()<=0) flag = false;
        
        return flag;
    }
}


