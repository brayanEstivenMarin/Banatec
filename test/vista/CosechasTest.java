/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;
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
public class CosechasTest {
    
    public CosechasTest() {
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
     * Test of fecha_actual method, of class Cosechas.
     */
    @Test
    public void testFecha_actual() {
        System.out.println("fecha_actual");
        String expResult = "2020/09/28";
        String result = Cosechas.fecha_actual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    

    /**
     * Test of cargar_lotes method, of class Cosechas.
     */
    @Test
    public void testCargar_lotes() {
        System.out.println("cargar_lotes");
        JComboBox cbox_lotes = null;
        Cosechas instance = new Cosechas();
        instance.cargar_lotes(cbox_lotes);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of limpiartxt method, of class Cosechas.
     */
    @Test
    public void testLimpiartxt() {
        System.out.println("limpiartxt");
        Cosechas instance = new Cosechas();
        instance.limpiartxt();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of listar method, of class Cosechas.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Cosechas instance = new Cosechas();
        instance.listar();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of guardar method, of class Cosechas.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Cosechas instance = new Cosechas();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of actualizar method, of class Cosechas.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Cosechas instance = new Cosechas();
        instance.actualizar();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of eliminar method, of class Cosechas.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Cosechas instance = new Cosechas();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
