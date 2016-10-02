package Classes;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class IngredienteTest {
    
    public IngredienteTest() {
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
     * Test of getQuantidade method, of class Ingrediente.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Ingrediente instance = new Ingrediente();
        long expResult = 0L;
        long result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Ingrediente.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        long quantidade = 0L;
        Ingrediente instance = new Ingrediente();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidademinima method, of class Ingrediente.
     */
    @Test
    public void testGetQuantidademinima() {
        System.out.println("getQuantidademinima");
        Ingrediente instance = new Ingrediente();
        long expResult = 0L;
        long result = instance.getQuantidademinima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidademinima method, of class Ingrediente.
     */
    @Test
    public void testSetQuantidademinima() {
        System.out.println("setQuantidademinima");
        long quantidademinima = 0L;
        Ingrediente instance = new Ingrediente();
        instance.setQuantidademinima(quantidademinima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Ingrediente.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Ingrediente instance = new Ingrediente();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Ingrediente.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Ingrediente instance = new Ingrediente();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdIngrediente method, of class Ingrediente.
     */
    @Test
    public void testGetIdIngrediente() {
        System.out.println("getIdIngrediente");
        Ingrediente instance = new Ingrediente();
        int expResult = 0;
        int result = instance.getIdIngrediente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdIngrediente method, of class Ingrediente.
     */
    @Test
    public void testSetIdIngrediente() {
        System.out.println("setIdIngrediente");
        int idIngrediente = 0;
        Ingrediente instance = new Ingrediente();
        instance.setIdIngrediente(idIngrediente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarIngrediente method, of class Ingrediente.
     */
    @Test
    public void testConsultarIngrediente() {
        System.out.println("consultarIngrediente");
        List<Ingrediente> ingredientes = null;
        Ingrediente instance = new Ingrediente();
        instance.consultarIngrediente(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarIngredBaixa method, of class Ingrediente.
     */
    @Test
    public void testConsultarIngredBaixa() {
        System.out.println("consultarIngredBaixa");
        List<Ingrediente> ingredientes = null;
        Ingrediente instance = new Ingrediente();
        instance.consultarIngredBaixa(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BaixaIngred method, of class Ingrediente.
     */
    @Test
    public void testBaixaIngred() {
        System.out.println("BaixaIngred");
        List<Ingrediente> ingredientes = null;
        String nomeIngrediente = "";
        int quantidade = 0;
        Ingrediente instance = new Ingrediente();
        instance.BaixaIngred(ingredientes, nomeIngrediente, quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
