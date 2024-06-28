package automatizados.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest6 extends BaseTest{
	
	public static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
    public void TC001_deveCriarOProduto(){
        produtoPage.criarProdutoETentarEditarDepois(1, "Desodorante", 99, 17, new Date());
    
        String nome = produtoPage.inputNome.getText();
        	
        assertEquals(nome, "Desodorante");
    }

}
