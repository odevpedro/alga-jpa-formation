import model.Produto;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsultandoRegistrosTest {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeClass
    public static void setupBeforeClass(){
        entityManagerFactory = Persistence
                .createEntityManagerFactory("Ecommerce-PU");


    }

    @AfterClass
    public static void tearDownAfterClass(){
        entityManagerFactory.close();
    }

    @Before
    public void setUp(){
            entityManager = entityManagerFactory.createEntityManager();

    }
    @After
    public void tearDown(){
        entityManager.close();
    }
    @Test
    public void BuscarPorIdentificador(){

        Produto produto = entityManager.find(Produto.class, 1);
        Assert.assertNotNull(produto);
        System.out.println(">>>>>> Esperado: " + produto.getNome());
        Assert.assertEquals("Kindle", produto.getNome());
    }

}
