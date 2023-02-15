/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud4.carritocompra;

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
public class CarritoTest {
    private Carrito cart1;
    private Producto prod1;
    private Producto prod2;
    public CarritoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        cart1= new Carrito(5);
        prod1=new Producto("P001","Plasma TV LG 32","Plasma TV with TDT", 669.99);
        cart1.insertar(prod1);
        prod2= new Producto("P002","DVD","DVD player Samsung", 39.99);
    }
    
    @AfterEach
    public void tearDown() {
        cart1=null;
        prod1=null;
        prod2=null;
    }

    /**
     * Test of obtenerPrecio method, of class Carrito.
     */
    @Test
    public void testObtenerPrecio() {
        System.out.println("obtenerPrecio");
        Carrito instance = cart1;
        double expResult = 669.99;
        double result = instance.obtenerPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class Carrito.
     */
    
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Producto producto = null;
        Carrito instance = null;
        instance.insertar(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrar method, of class Carrito.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        Producto producto = null;
        Carrito instance = null;
        instance.borrar(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class Carrito.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Carrito instance = null;
        Producto[] expResult = null;
        Producto[] result = instance.getProductos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContProductos method, of class Carrito.
     */
    @Test
    public void testGetContProductos() {
        System.out.println("getContProductos");
        Carrito instance = null;
        int expResult = 0;
        int result = instance.getContProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
