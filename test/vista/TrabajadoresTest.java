/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

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
public class TrabajadoresTest {
    
    public TrabajadoresTest() {
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
     * Test of listar method, of class Trabajadores.
     */
    @Test
    public void testListar() {
        System.out.println("Campos vacios");
        Trabajadores instance = new Trabajadores();
        instance.listar();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of guardar method, of class Trabajadores.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Trabajadores instance = new Trabajadores();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of limpiartxt method, of class Trabajadores.
     */
    @Test
    public void testLimpiartxt() {
        System.out.println("limpiartxt");
        Trabajadores instance = new Trabajadores();
        instance.limpiartxt();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of actualizar method, of class Trabajadores.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Trabajadores instance = new Trabajadores();
        instance.actualizar();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of eliminar method, of class Trabajadores.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Trabajadores instance = new Trabajadores();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}