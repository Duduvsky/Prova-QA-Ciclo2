package automatizados.pageObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

    public ProdutoPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    @FindBy(id = "btn-adicionar")
    public WebElement buttonCriar;

    @FindBy(id = "codigo")
    public WebElement inputCodigo;
    
    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "quantidade")
    public WebElement inputQtde;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "data")
    public WebElement inputData;

    @FindBy(id = "btn-salvar")
    public WebElement buttonSalvar;
    
    @FindBy(id = "btn-sair")
    public WebElement buttonSair;
    
    @FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[6]/button[2]")
    public WebElement buttonExcluir;
    
    @FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[6]/button[1]")
    public WebElement buttonEditar;

    @FindBy(xpath = "//*[@id=\"cadastro-produto\"]/div/div/div[1]/button")
    public WebElement buttonX;
    
    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    @FindBy(xpath = "/html/body/div/div[2]/table/tbody")
    public WebElement linhaProdutos;

    public String obterMensagem() {
		return this.spanMensagem.getText();
	}
    
    public void criarProduto(int codigo, String nome, int qtde, int valor, Date data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

        buttonCriar.click();
        buttonCriar.click();
        escrever(inputCodigo, Integer.toString(codigo));
        escrever(inputNome, nome);
        escrever(inputQtde, Integer.toString(qtde));
        escrever(inputValor, Integer.toString(valor));
        escrever(inputData, dataFormat);
        buttonSalvar.click();
    }
    
    public void criarProduto2(int codigo, String nome, int qtde, int valor, Date data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

        escrever(inputCodigo, Integer.toString(codigo));
        escrever(inputNome, nome);
        escrever(inputQtde, Integer.toString(qtde));
        escrever(inputValor, Integer.toString(valor));
        escrever(inputData, dataFormat);
        buttonSalvar.click();
    }
    
    public void criarProdutoString(String codigo, String nome, String qtde, String valor, String data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

 
        escrever(inputCodigo, codigo);
        escrever(inputNome, nome);
        escrever(inputQtde, qtde);
        escrever(inputValor, valor);
        escrever(inputData, dataFormat);
        buttonSalvar.click();
    }

    private void escrever(WebElement input, String texto) {
	input.clear();
	input.sendKeys(texto + Keys.TAB);

	}

    public int contaProdutos() { 
        List<WebElement> linhas = linhaProdutos.findElements(By.tagName("tr"));
//         return !linhas.isEmpty();
        return linhas.size();
    }
    
    public void tentarCriarProdutoESairNoProcesso(String codigo, String nome, String qtde, String valor, Date data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

        buttonCriar.click();
        buttonCriar.click();
        escrever(inputCodigo, codigo);
        escrever(inputNome, nome);
        escrever(inputQtde, qtde);
        escrever(inputValor, valor);
        escrever(inputData, dataFormat);
        
        buttonSair.click();
        buttonSair.click();
        
        buttonCriar.click();
         
    }
    
    public void tentarCriarProdutoEApertarXNoProcesso(String codigo, String nome, String qtde, String valor){

        buttonCriar.click();
        buttonCriar.click();
        escrever(inputCodigo, codigo);
        escrever(inputNome, nome);
        escrever(inputQtde, qtde);
        escrever(inputValor, valor);
        
        buttonX.click();
        
        buttonCriar.click();
         
    }
    
    public void criarProdutoEExcluir(int codigo, String nome, int qtde, int valor, Date data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

        buttonCriar.click();
        buttonCriar.click();
        escrever(inputCodigo, Integer.toString(codigo));
        escrever(inputNome, nome);
        escrever(inputQtde, Integer.toString(qtde));
        escrever(inputValor, Integer.toString(valor));
        escrever(inputData, dataFormat);
        buttonSalvar.click();
        
        buttonExcluir.click();
    }
    
    public void criarProdutoETentarEditarDepois(int codigo, String nome, int qtde, int valor, Date data){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatoData.format(data);

        buttonCriar.click();
        buttonCriar.click();
        escrever(inputCodigo, Integer.toString(codigo));
        escrever(inputNome, nome);
        escrever(inputQtde, Integer.toString(qtde));
        escrever(inputValor, Integer.toString(valor));
        escrever(inputData, dataFormat);
        buttonSalvar.click();
        
        buttonEditar.click();
    }
}
