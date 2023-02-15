/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ud4.cuenta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW122
 */
public class CuentaTest {
    private Cuenta cuenta1;
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cuenta1=new Cuenta("ES2345",233.00f);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Cuenta.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuenta instance = cuenta1;
        String expResult = "ES2345";
        try {
        String result = instance.getNumero();
        assertEquals(expResult, result);
        } catch (Error e){
        // TODO review the generated test code and remove the default call to fail.
        fail("No supera el test getnumero.");
        }
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = null;
        float expResult = 0.0F;
        float result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Cuenta.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numCta = "";
        Cuenta instance = null;
        instance.setNumero(numCta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldoCta = 0.0F;
        Cuenta instance = null;
        instance.setSaldo(saldoCta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarDinero method, of class Cuenta.
     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        float importe = 0.0F;
        Cuenta instance = null;
        instance.ingresarDinero(importe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerDinero method, of class Cuenta.
     */
    @Test
    public void testExtraerDinero() {
        System.out.println("extraerDinero");
        float importe = 20F;
        Cuenta instance = cuenta1;
        instance.extraerDinero(importe);
        float resultExp=213f;
        float real=instance.getSaldo();
        try{
        assertEquals(resultExp,real,0.00);
        }catch (Error e){
            fail("No es el saldo esperado.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of monstrarCuenta method, of class Cuenta.
     */
    @Test
    public void testMonstrarCuenta() {
        System.out.println("monstrarCuenta");
        Cuenta instance = null;
        instance.monstrarCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
