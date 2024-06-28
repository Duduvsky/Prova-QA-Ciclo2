package automatizados.test;


import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest extends BaseTest{

    public static ProdutoPO produtoPage;

    @BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}

    @Test
    public void TC001_deveCriarOProduto(){
        produtoPage.criarProduto(1, "Desodorante", 99, 17, new Date());
        int qtde = produtoPage.contaProdutos();
    

        assertTrue(qtde>0);
    }
    
}
