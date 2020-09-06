/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHAGGY
 */
public class LotesTest {
    
    public LotesTest() {
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
     * Test of lista method, of class Lotes.
     */
    @Test
    public void testLista() {
           Conexion cn=new Conexion();
        System.out.println("lista");
        Lotes instance = new Lotes();
        instance.lista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class Lotes.
     */
    @Test
    public void testAgregar() {
           Conexion cn=new Conexion();
        System.out.println("agregar");
        Lotes instance = new Lotes();
        instance.agregar();
        // TODO review the generated test code and remove the default call to fail.
        fail("");
    }

    /**
     * Test of actualizar method, of class Lotes.
     */
    @Test
    public void testActualizar() {
           Conexion cn=new Conexion();
        System.out.println("actualizar");
        Lotes instance = new Lotes();
        instance.actualizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Lotes.
     */
    @Test
    public void testEliminar() {
           Conexion cn=new Conexion();
        System.out.println("eliminar");
        Lotes instance = new Lotes();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevo method, of class Lotes.
     */
    @Test
    public void testNuevo() {
           Conexion cn=new Conexion();
        System.out.println("nuevo");
        Lotes instance = new Lotes();
        instance.nuevo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiartabla method, of class Lotes.
     */
    @Test
    public void testLimpiartabla() {
           Conexion cn=new Conexion();
        System.out.println("limpiartabla");
        Lotes instance = new Lotes();
        instance.limpiartabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
