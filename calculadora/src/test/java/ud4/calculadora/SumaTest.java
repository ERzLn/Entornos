/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud4.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DAW122
 */
public class SumaTest {
    
    public SumaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSuma method, of class Suma.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 0.0;
        double b = 0.0;
        Suma instance = new Suma();
        double expResult = 0.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of incrementa method, of class Suma.
     */
    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 1;
        Suma instance = new Suma();
        double expResult = 0.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
