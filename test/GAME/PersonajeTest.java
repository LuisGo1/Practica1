/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GAME;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Gomez
 */
public class PersonajeTest {
    
    public PersonajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setNombre method, of class Personaje.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String _nombre = "";
        Personaje instance = new PersonajeImpl();
        instance.setNombre(_nombre);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Personaje.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personaje instance = new PersonajeImpl();
        String expResult = "DESTINY";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalud method, of class Personaje.
     */
    @Test
    public void testSetSalud() {
        System.out.println("setSalud");
        int _salud = 100;
        Personaje instance = new PersonajeImpl();
        instance.setSalud(_salud);
        // TODO review the generated test code and remove the default call to fail.
     //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Personaje.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Personaje instance = new PersonajeImpl();
        int expResult = 100;
        int result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setAtaque method, of class Personaje.
     */
    @Test
    public void testSetAtaque() {
        System.out.println("setAtaque");
        int _ataque = 100;
        Personaje instance = new PersonajeImpl();
        instance.setAtaque(_ataque);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAtaque method, of class Personaje.
     */
    @Test
    public void testGetAtaque() {
        System.out.println("getAtaque");
        Personaje instance = new PersonajeImpl();
        int expResult = 50;
        int result = instance.getAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDefensa method, of class Personaje.
     */
    @Test
    public void testSetDefensa() {
        System.out.println("setDefensa");
        int _defensa = 0;
        Personaje instance = new PersonajeImpl();
        instance.setDefensa(_defensa);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDefensa method, of class Personaje.
     */
    @Test
    public void testGetDefensa() {
        System.out.println("getDefensa");
        Personaje instance = new PersonajeImpl();
        int expResult = 20;
        int result = instance.getDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTa method, of class Personaje.
     */
    @Test
    public void testSetTa() {
        System.out.println("setTa");
        double _ta = 100;
        Personaje instance = new PersonajeImpl();
        instance.setTa(_ta);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTa method, of class Personaje.
     */
    @Test
    public void testGetTa() {
        System.out.println("getTa");
        Personaje instance = new PersonajeImpl();
        double expResult = 0.5;
        double result = instance.getTa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of GANAR method, of class Personaje.
     */
    @Test
    public void testGANAR() {
        System.out.println("GANAR");
        Personaje instance = new PersonajeImpl();
        instance.GANAR();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ATAQUES method, of class Personaje.
     */
    @Test
    public void testATAQUES() {
        System.out.println("ATAQUES");
        int _ataque = 50;
        Personaje instance = new PersonajeImpl();
        instance.ATAQUES(_ataque);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ESTRATEGIA method, of class Personaje.
     */
    @Test
    public void testESTRATEGIA() {
        System.out.println("ESTRATEGIA");
        Personaje instance = new PersonajeImpl();
        instance.ESTRATEGIA();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of vida method, of class Personaje.
     */
    @Test
    public void testVida() {
        System.out.println("vida");
        Personaje instance = new PersonajeImpl();
        boolean expResult = true;
        boolean result = instance.vida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    public class PersonajeImpl extends Personaje {

        public void GANAR() {
        }
    }
    
}
