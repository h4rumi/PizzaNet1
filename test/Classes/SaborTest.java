package Classes;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SaborTest {
    
    public SaborTest() {
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
     * Test of getIdSabor method, of class Sabor.
     */
    @Test
    public void testGetIdSabor() {
        System.out.println("getIdSabor");
        Sabor instance = new Sabor();
        int expResult = 0;
        int result = instance.getIdSabor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSabor method, of class Sabor.
     */
    @Test
    public void testSetIdSabor() {
        System.out.println("setIdSabor");
        int idSabor = 0;
        Sabor instance = new Sabor();
        instance.setIdSabor(idSabor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Sabor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Sabor instance = new Sabor();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Sabor.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Sabor instance = new Sabor();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Sabor.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Sabor instance = new Sabor();
        double expResult = 0.0;
        double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Sabor.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 0.0;
        Sabor instance = new Sabor();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_ingrediente method, of class Sabor.
     */
    @Test
    public void testGetId_ingrediente() {
        System.out.println("getId_ingrediente");
        Sabor instance = new Sabor();
        int[] expResult = null;
        int[] result = instance.getId_ingrediente();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdIngrediente method, of class Sabor.
     */
    @Test
    public void testSetIdIngrediente() {
        System.out.println("setIdIngrediente");
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        Sabor instance = new Sabor();
        instance.setIdIngrediente(i1, i2, i3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarSabor method, of class Sabor.
     */
    @Test
    public void testConsultarSabor() {
        System.out.println("consultarSabor");
        List<Sabor> sabores = null;
        Sabor instance = new Sabor();
        instance.consultarSabor(sabores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarIngSabor method, of class Sabor.
     */
    @Test
    public void testConsultarIngSabor() {
        System.out.println("consultarIngSabor");
        List<Sabor> sabores = null;
        List<Ingrediente> ingredientes = null;
        Sabor instance = new Sabor();
        instance.consultarIngSabor(sabores, ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
