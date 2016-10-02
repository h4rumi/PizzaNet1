package Classes;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FornecedorTest {
    
    public FornecedorTest() {
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
     * Test of getNome method, of class Fornecedor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Fornecedor.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Fornecedor instance = new Fornecedor();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Fornecedor.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Fornecedor.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Fornecedor instance = new Fornecedor();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Fornecedor.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Fornecedor.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        int telefone = 0;
        Fornecedor instance = new Fornecedor();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Fornecedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Fornecedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Fornecedor instance = new Fornecedor();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarFornecedor method, of class Fornecedor.
     */
    @Test
    public void testConsultarFornecedor() {
        System.out.println("consultarFornecedor");
        List<Fornecedor> fornecedores = null;
        Fornecedor instance = new Fornecedor();
        instance.consultarFornecedor(fornecedores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
