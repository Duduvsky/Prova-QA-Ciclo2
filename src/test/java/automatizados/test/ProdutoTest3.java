package automatizados.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.ProdutoPO;

public class ProdutoTest3 extends BaseTest{
	
	public static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
    public void TC003_naoDevePermanecerOsDadosDigitadosQuandoClicarNoBotaoSair(){
        produtoPage.tentarCriarProdutoESairNoProcesso("2", "Melhor amigo, Valim", "1", "1", new Date());

        String id = produtoPage.inputCodigo.getText();
        String nome = produtoPage.inputNome.getText();
        String quantidade = produtoPage.inputQtde.getText();
        String valor = produtoPage.inputValor.getText();
        String data = produtoPage.inputData.getText();
		
		assertEquals(id, "");
		assertEquals(nome, "");
		assertEquals(quantidade, "");
		assertEquals(valor, "");
		assertEquals(data, "");
    }

}
