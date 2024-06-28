package automatizados.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest5 extends BaseTest{
	
	public static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
    public void TC005_excluirUmProdutoAposACriacaoDoMesmo(){
		produtoPage.criarProdutoEExcluir(1, "Guerreiro Valim", 1, 1, new Date());
		int qtde = produtoPage.contaProdutos();
		
		assertTrue(qtde==0);
        
    }
}
