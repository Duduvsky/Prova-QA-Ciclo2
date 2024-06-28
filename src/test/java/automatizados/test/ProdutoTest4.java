package automatizados.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest4 extends BaseTest{
	public static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
    public void TC004_naoDevePermanecerOsDadosDigitadosQuandoClicarNoBotaoX(){
        produtoPage.tentarCriarProdutoEApertarXNoProcesso("5", "Guerreiro Valim", "1", "Infinito");

        String id = produtoPage.inputCodigo.getText();
        String nome = produtoPage.inputNome.getText();
        String quantidade = produtoPage.inputQtde.getText();
        String valor = produtoPage.inputValor.getText();
		
		assertEquals(id, "");
		assertEquals(nome, "");
		assertEquals(quantidade, "");
		assertEquals(valor, "");
    }
}
