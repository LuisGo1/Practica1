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
public class MIKEYTest {
    
    public MIKEYTest() {
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
     * Test of GOLPE_TACTICO method, of class MIKEY.
     */
    @Test
    public void testGOLPE_TACTICO() {
        System.out.println("GOLPE_TACTICO");
        MIKEY instance = new MIKEY();
        instance.GOLPE_TACTICO();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**gracias
     * Test of GANAR method, of class MIKEY.
     */
    @Test
    public void testGANAR() {
        System.out.println("GANAR");
        MIKEY instance = new MIKEY();
        instance.GANAR();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
