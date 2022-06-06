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
public class pandaTest {
    
    public pandaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of subir_Ataque method, of class panda.
     */
    @Test
    public void testSubir_Ataque() {
        System.out.println("subir_Ataque");
        panda instance = new panda();
        instance.subir_Ataque();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of GANAR method, of class panda.
     */
    @Test
    public void testGANAR() {
        System.out.println("GANAR");
        panda instance = new panda();
        instance.GANAR();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
