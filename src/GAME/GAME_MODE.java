/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GAME;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Genesis_Brito
 * @author Luis_Gomez
 */
public class GAME_MODE {

    public static void main(String[] args) {
        // TODO code application logic here

        //PERSONAJES
        //NUEVA VARIABLE PARA EL CAST Y EL POLIMORFISMO
        Personaje _mikey = new MIKEY();
        Personaje _panda = new panda();
        Personaje _lucy = new LUCY();
        Personaje _jossy = new JOSSY();
        Personaje _destiny = new DESTINY();

        int TURNOS = 0;
        String PERSONAJE = "", OPONENTE = "", BATALLA = "";
        Scanner sc = new Scanner(System.in);
        //Aqui se le agrega el Try Catch//
        try{
            
        System.out.println("\033[31m"+"***************************************************");
        System.out.println("\033[34m"+"ARRIVEDERCHI PLAYER_TOWN, BIENVENIDO A ESTA BATALLA");
        System.out.println("\033[31m"+"***************************************************\n\n");
        System.out.println("\033[31m"+"*****************************************************************************");
        System.out.println("\033[34m"+"TE SALUDA TU CAPITAN AL MANDO, ELIGE UN PERSONAJE Y PREPARATE PARA LA ACCION");
        System.out.println("\033[31m"+"*****************************************************************************\n\n");
        System.out.println("\033[34m"+"SELECCIONA TU PERSONAJE:\n");
        System.out.println("\033[34m"+"1. MIKEY");
        System.out.println("\033[34m"+"2. PANDA");
        System.out.println("\033[34m"+"3. LUCY");
        System.out.println("\033[34m"+"4. JOSSY");
        System.out.println("\033[34m"+"5. DESTINY");
        PERSONAJE = sc.next();

        System.out.println("\033[31m"+"ELIGE TU RIVAL:\n");
        System.out.println("\033[31m"+"1. MIKEY");
        System.out.println("\033[31m"+"2. PANDA");
        System.out.println("\033[31m"+"3. LUCY");
        System.out.println("\033[31m"+"4. JOSSY");
        System.out.println("\033[31m"+"5. DESTINY");
        OPONENTE = sc.next();

        while (PERSONAJE.contains(OPONENTE)) 
        {
            System.out.println("**********************************************************************************");
            System.out.println("RECUERDA elegir el mismo jugador como personaje principal y oponente ES IMPOSIBLE.");
            System.out.println("******************************************************************************\n\n");
            System.out.println("SELECCIONA TU OPONENTE PARA EL CAMPO DE BATALLA:\n");
            System.out.println("1. MIKEY");
            System.out.println("2. PANDA");
            System.out.println("3. LUCY");
            System.out.println("4. JOSSY");
            System.out.println("5. DESTINY");
            OPONENTE = sc.next();
        }
        
        BATALLA = PERSONAJE.trim() + OPONENTE.trim();
        switch (BATALLA) 
        {
            case "12": 
            {
                while (_mikey.vida()&& _panda.vida());
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_mikey.getTa()) == 1) 
                    {
                        _panda.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                        _panda.ESTRATEGIA();
                    }
                    if (lucha(_panda.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    // CASTING
                    ((panda)_panda).subir_Ataque();
                    ((MIKEY)_mikey).GOLPE_TACTICO();
    
                }
                System.out.println();

                if (_mikey.vida())_mikey.GANAR();
                else 
                {
                    _panda.GANAR();
                }

                break;
            }
            case "13": 
            {
                while (_mikey.vida() && _lucy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_mikey.getTa()) == 1) 
                    {
                        _lucy.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                        _lucy.ESTRATEGIA();
                    }
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_lucy.getAtaque());
                    } else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    //CASTING
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                    ((LUCY)_lucy).Ataque_siniestro();
                }
                if (_mikey.vida()) _mikey.GANAR();
               
                else 
                {
                    _lucy.GANAR();
                }
                break;
            }
            case "14": 
            {
                while (_mikey.vida() && _jossy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_mikey.getTa()) == 1) 
                    {
                        _jossy.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                        _jossy.ESTRATEGIA();
                    }
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                   // //revision de cast//////
                   
                }
                if (_mikey.vida())_mikey.GANAR();
                else 
                {
                    _jossy.GANAR();
                }

                break;
            }
            case "15": 
            {
                while (_mikey.vida() && _destiny.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_mikey.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                    if (lucha(_mikey.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                }
                if (_mikey.vida())_mikey.GANAR(); 
                else 
                {
                    _destiny.GANAR();
                }

                break;
            }
            case "21": 
            {
                while (_panda.vida()&&_mikey.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_panda.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    if (lucha(_panda.getTa()) == 1) 
                    {
                       _panda.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                       _panda.ESTRATEGIA();
                    }

                    ((panda)_panda).subir_Ataque();
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                }
                 System.out.println();
                 
                if(_panda.vida())_panda.GANAR();
                else
                {
                    _mikey.GANAR();
                }
                break;
            }
            case "23": 
            {
                while (_panda.vida()&&_lucy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_panda.getTa()) == 1) 
                    {
                        _lucy.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _lucy.ESTRATEGIA();
                    }
                    
                    if (lucha(_panda.getTa()) == 1) 
                    {
                       _panda.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                       _panda.ESTRATEGIA();
                    }

                    ((panda)_panda).subir_Ataque();
                    ((LUCY)_lucy).Ataque_siniestro();
                }
                 System.out.println();
                 
                if(_panda.vida())_panda.GANAR();
                else
                {
                    _lucy.GANAR();
                }
                break;
            }
            case "24": 
            {
                while (_panda.vida()&&_jossy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_panda.getTa()) == 1) 
                    {
                        _jossy.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _jossy.ESTRATEGIA();
                    }
                    
                    if (lucha(_panda.getTa()) == 1) 
                    {
                       _panda.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                       _panda.ESTRATEGIA();
                    }

                    ((panda)_panda).subir_Ataque();
                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                }
                 System.out.println();
                 
                if(_panda.vida())_panda.GANAR();
                else
                {
                    _jossy.GANAR();
                }
                break;
            }
            case "25": 
            {
                while (_panda.vida()&&_destiny.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_panda.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                    
                    if (lucha(_panda.getTa()) == 1) 
                    {
                       _panda.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                       _panda.ESTRATEGIA();
                    }

                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                }
                 System.out.println();
                 
                if(_panda.vida())_panda.GANAR();
                else
                {
                    _destiny.GANAR();
                }
                break;
            }
            case "31": 
            {
                while (_lucy.vida() && _mikey.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                       _lucy.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                       _lucy.ESTRATEGIA();
                    }

                    ((LUCY)_lucy).Ataque_siniestro();
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                }
                System.out.println();
                 
                if(_lucy.vida())_lucy.GANAR();
                else
                {
                    _mikey.GANAR();
                }
                break;
                    
            }
            case "32": 
            {
                while (_lucy.vida() && _panda.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                        _panda.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                        _panda.ESTRATEGIA();
                    }
                    
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                       _lucy.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                       _lucy.ESTRATEGIA();
                    }

                    ((LUCY)_lucy).Ataque_siniestro();
                    ((panda)_panda).subir_Ataque();
                }
                System.out.println();
                 
                if(_lucy.vida())_lucy.GANAR();
                else
                {
                    _panda.GANAR();
                }
                break;
                    
            }
             case "34": 
            {
                while (_lucy.vida() && _jossy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                        _jossy.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                        _jossy.ESTRATEGIA();
                    }
                    
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                       _lucy.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                       _lucy.ESTRATEGIA();
                    }

                    ((LUCY)_lucy).Ataque_siniestro();
                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                }
                System.out.println();
                 
                if(_lucy.vida())_lucy.GANAR();
                else
                {
                    _jossy.GANAR();
                }
                break;
                    
            }
              case "35": 
            {
                while (_lucy.vida() && _destiny.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                    
                    if (lucha(_lucy.getTa()) == 1) 
                    {
                       _lucy.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                       _lucy.ESTRATEGIA();
                    }

                    ((LUCY)_lucy).Ataque_siniestro();
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                }
                System.out.println();
                 
                if(_lucy.vida())_lucy.GANAR();
                else
                {
                    _destiny.GANAR();
                }
                break;
                    
            }
            case "41": 
            {
                while (_jossy.vida() && _mikey.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                       _jossy.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                       _jossy.ESTRATEGIA();
                    }

                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                }
                System.out.println();
                 
                if(_jossy.vida())_jossy.GANAR();
                else
                {
                    _mikey.GANAR();
                }
                break;
                    
            }
            case "42": 
            {
                while (_jossy.vida() && _panda.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                        _panda.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _panda.ESTRATEGIA();
                    }
                    
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                       _jossy.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                       _jossy.ESTRATEGIA();
                    }

                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                    ((panda)_panda).subir_Ataque();
                }
                System.out.println();
                 
                if(_jossy.vida())_jossy.GANAR();
                else
                {
                    _panda.GANAR();
                }
                break;
                    
            }
            case "43": 
            {
                while (_jossy.vida() && _lucy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                        _lucy.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _lucy.ESTRATEGIA();
                    }
                    
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                       _jossy.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                       _jossy.ESTRATEGIA();
                    }

                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                    ((LUCY)_lucy).Ataque_siniestro();
                }
                System.out.println();
                 
                if(_jossy.vida())_jossy.GANAR();
                else
                {
                    _lucy.GANAR();
                }
                break;
                    
            }
            case "45": 
            {
                while (_jossy.vida() && _destiny.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                    
                    if (lucha(_jossy.getTa()) == 1) 
                    {
                       _jossy.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                       _jossy.ESTRATEGIA();
                    }

                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                }
                System.out.println();
                 
                if(_jossy.vida())_jossy.GANAR();
                else
                {
                    _destiny.GANAR();
                }
                break;
                    
            }
            case "51": 
            {
                while (_destiny.vida() && _mikey.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _mikey.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                        _mikey.ESTRATEGIA();
                    }
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_mikey.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                   
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                    ((MIKEY)_mikey).GOLPE_TACTICO();
                }
                if (_destiny.vida())_destiny.GANAR(); 
                else 
                {
                    _mikey.GANAR();
                }

                break;
            }
            case "52": 
            {
                while (_destiny.vida() && _panda.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _panda.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                        _panda.ESTRATEGIA();
                    }
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_panda.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                   
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                    ((panda)_panda).subir_Ataque();
                }
                if (_destiny.vida())_destiny.GANAR(); 
                else 
                {
                    _panda.GANAR();
                }

                break;
            }
            case "53": 
            {
                while (_destiny.vida() && _lucy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _lucy.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                        _lucy.ESTRATEGIA();
                    }
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_lucy.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                   
                   ((DESTINY)_destiny).perdida_Critica();
                   ((DESTINY)_destiny).recuperar_Vida();
                   ((LUCY)_lucy).Ataque_siniestro();
                }
                if (_destiny.vida())_destiny.GANAR(); 
                else 
                {
                    _lucy.GANAR();
                }

                break;
            }
            case "54": 
            {
                while (_destiny.vida() && _jossy.vida()) 
                {
                    TURNOS++;
                    System.out.println();
                    System.out.println("Ronda #" + TURNOS);
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _jossy.ATAQUES(_destiny.getAtaque());
                    } 
                    else 
                    {
                        _jossy.ESTRATEGIA();
                    }
                    if (lucha(_destiny.getTa()) == 1) 
                    {
                        _destiny.ATAQUES(_jossy.getAtaque());
                    } 
                    else 
                    {
                        _destiny.ESTRATEGIA();
                    }
                   
                    ((DESTINY)_destiny).perdida_Critica();
                    ((DESTINY)_destiny).recuperar_Vida();
                    ((JOSSY)_jossy).mejorAtaque();
                    ((JOSSY)_jossy).llenarVida();
                }
                if (_destiny.vida())_destiny.GANAR(); 
                else 
                {
                    _jossy.GANAR();
                }

                break;
            }
            default:
            {
              System.out.println("\033[34m"+"cuidado soldado... Las que has ingresado aun no estan disponibles");
                break;
            }  
         }
        } catch(RuntimeException mensaje){
                System.out.println("Reiniciar El Programa hubo un error en una ejecucion"); 
        }
        
    }
        public static int lucha(double ta)
    {
        Random r = new Random();
        int flag = 0; 
        int a = r.nextInt(100);
        if(a< (int)(ta*100))
        {
            flag =1;
        }
        return flag;
    }
              
}   
            