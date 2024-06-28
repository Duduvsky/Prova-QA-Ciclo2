package automatizados.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest7 extends BaseTest{
	
	public static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
    public void TC007_naoDeveCriarOProdutoComMesmoCodigo(){
        produtoPage.criarProduto(1, "Cadeira", 20, 10, new Date());
        produtoPage.buttonSair.click();
        produtoPage.buttonCriar.click();
        produtoPage.inputCodigo.click();
        produtoPage.criarProduto2(1, "TV", 1, 1, new Date());
 
        int qtde = produtoPage.contaProdutos();
    

        assertTrue(qtde == 2);
    }
}
