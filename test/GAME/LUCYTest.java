/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GAME;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Gomez
 */
public class LUCYTest {
    
    public LUCYTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Ataque_siniestro method, of class LUCY.
     */
    @Test
    public void testAtaque_siniestro() {
        System.out.println("Ataque_siniestro");
        LUCY instance = new LUCY();
        instance.Ataque_siniestro();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GANAR method, of class LUCY.
     */
    @Test
    public void testGANAR() {
        System.out.println("GANAR");
        LUCY instance = new LUCY();
        instance.GANAR();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vida method, of class LUCY.
     */
    @Test
    public void testVida() {
        System.out.println("vida");
        LUCY instance = new LUCY();
        boolean expResult = true;
        boolean result = instance.vida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ESTRATEGIA method, of class LUCY.
     */
    @Test
    public void testESTRATEGIA() {
        System.out.println("ESTRATEGIA");
        LUCY instance = new LUCY();
        instance.ESTRATEGIA();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
