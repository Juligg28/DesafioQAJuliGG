package steps;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import pages.Dadospage;
import pages.MenuPage;

import java.time.Duration;

public class Teste {

public MenuPage menuPage;
    WebDriver driver;
public Dadospage dadosPage;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        menuPage = new MenuPage(driver);
        dadosPage = new Dadospage(driver);
    }

    @Given("que o usuario acessa ao site {string}")
    public void queOUsuarioAcessaAoSite(String arg0) {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        Assert.assertEquals("Enter Vehicle Data",driver.getTitle());
    }

    @When("ele clica na opcao Automobile no menu superior esquerdo")
    public void ele_clica_na_opcao_automobile_no_menu_superior_esquerdo() {
       menuPage.AutomobileMenu();
    }

    @And("ele preenche o formulario da aba dados do veiculo {string} e clica no botao next")
    public void elePreencheOFormularioDaAbaDadosDoVeiculoEClicaNoBotaoNext(String arg0) {

        //preencher o campo fabricante "make"
        dadosPage.escolherFabricante();
        //WebElement fabricante = driver.findElement(By.id("make"));
       // Select selectFabricante = new Select(fabricante);
       // selectFabricante.selectByValue("BMW");

        //preencher a versao do veiculo "Enginer Performance"
        WebElement versao = driver.findElement(By.id("engineperformance"));
        versao.clear();
        versao.sendKeys("1.6");

        //preencher a data de fabricacao do veiculo "Date Of Manufacture"
        WebElement datamanufatura = driver.findElement(By.id("dateofmanufacture"));
        datamanufatura.clear();
        datamanufatura.sendKeys("04/08/2018");

        //preencher a quantidade de assentos do veiculo "Number of Seats"
        WebElement assentos = driver.findElement(By.id("numberofseats"));
        Select selectAssentos = new Select(assentos);
        selectAssentos.selectByValue("5");

        //preencher o tipo de combustÃ­vel "Fuel Type"
        WebElement combustivel = driver.findElement(By.id("fuel"));
        Select selectCombustivel = new Select(combustivel);
        selectCombustivel.selectByValue("Gas");

        //preencher o valor de tabela do veiculo "List Price";
        WebElement valortabela = driver.findElement(By.id("listprice"));
        valortabela.clear();
        valortabela.sendKeys("20000");

        //preencher o numero da placa "Licence Plate Number"
        WebElement placa = driver.findElement(By.id("licenseplatenumber"));
        placa.clear();
        placa.sendKeys("NDA-1465");

        //preencher a media anual de kilometros rodados "Annual Mileage"
        WebElement quilometragem = driver.findElement(By.id("annualmileage"));
        quilometragem.clear();
        quilometragem.sendKeys("15000");

        //clicar no botao next
        driver.findElement(By.id("nextenterinsurantdata")).click();
        // colocar um assert equals em quantidade de campos igual a zero

    }

    @And("preenche o formulario da aba dados do item segurado {string} e clica no botao next")
    public void preencheOFormularioDaAbaDadosDoItemSeguradoEClicaNoBotaoNext(String arg0) {

        //preencher o campo nome do proprietario do veiculo "First Name"
        WebElement primeiroNome = driver.findElement(By.id("firstname"));
        primeiroNome.clear();
        primeiroNome.sendKeys("Maria");

        //preencher o campo sobrenome do proprietario do veiculo "Last Name"
        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.clear();
        sobrenome.sendKeys("Farias");

        //preencher o campo data de nascimento Birth Date
        WebElement nascimento = driver.findElement(By.id("birthdate"));
        nascimento.clear();
        nascimento.sendKeys("04/04/1982");

        //preencher o campo genero Male "Gender"
        WebElement gender = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"));
        gender.click();

        //preencher o campo rua com numero e complemento (se houver) "Street Address"
        WebElement endereco = driver.findElement(By.id("streetaddress"));
        endereco.clear();
        endereco.sendKeys("Rua do Naquel, 403");

        //preencher o campo pais de residencia "Country"
        WebElement pais = driver.findElement(By.id("country"));
        Select selectPais = new Select(pais);
        selectPais.selectByValue("Brazil");

        //preencher o campo com o CEP "Zip Code"
        WebElement cep = driver.findElement(By.id("zipcode"));
        cep.clear();
        cep.sendKeys("59076330");

        //preencher o campo cidade "City"
        WebElement cidade = driver.findElement(By.id("city"));
        cidade.clear();
        cidade.sendKeys("Natal");

        //preencher o campo ocupacao atual "Occupation"
        WebElement ocupacao = driver.findElement(By.id("occupation"));
        Select selectOcupacao = new Select(ocupacao);
        selectOcupacao.selectByValue("Public Official");

        //preencher o campo hobbies "cliffdiving"
        WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span"));
        hobbies.click();

        //preencher o campo Website
        WebElement site = driver.findElement(By.id("website"));
        site.clear();
        site.sendKeys("www.facebook.com/mariafarias");

        //aqui deveria inserir uma foto

        // clicar no botao Next
        WebElement next = driver.findElement(By.id("nextenterproductdata"));
        next.click();
    }

    @And("preenche o formulario da aba dados do seguro {string} e clica no botao next")
    public void preencheOFormularioDaAbaDadosDoSeguroEClicaNoBotaoNext(String arg0) {

        //preencher com a data de inicio da cobertura do seguro (devera ser mais de um mes antes da data) "Start Date"
        WebElement datainicio = driver.findElement(By.id("startdate"));
        datainicio.clear();
        datainicio.sendKeys("08/01/2022");

        //preencher com o valor de cobertura do seguro "Insurance Sum"
        WebElement vcobertura = driver.findElement(By.id("insurancesum"));
        Select selectVcobertura = new Select(vcobertura);
        selectVcobertura.selectByValue("10000000");

        //preencher com a classe de bonus de seguro que voce já possui "Merit Rating"
        WebElement bonus = driver.findElement(By.id("meritrating"));
        Select selectBonus = new Select(bonus);
        selectBonus.selectByValue("Bonus 3");

        //preencher com a cobertura desejada pelo segurado "Damage Insurance"
        WebElement cobertura = driver.findElement(By.id("damageinsurance"));
        Select selectCobertura = new Select(cobertura);
        selectCobertura.selectByValue("Full Coverage");

        //preencher com coberturas opcionais "Optional Products"
        WebElement coberturaopcional = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span"));
        coberturaopcional.click();

        //preencher se desejar a cobertura de um carro reserva em caso de sinistro "Courtesy Car"
        WebElement carroreserva = driver.findElement(By.id("courtesycar"));
        Select selectCarroReserva = new Select(carroreserva);
        selectCarroReserva.selectByValue("Yes");

        // clicar no botao Next
        WebElement next = driver.findElement(By.id("nextselectpriceoption"));
        next.click();

        //Assertions.assertEquals("Select Price Option", walle.findElement(By.id("selectpriceoption"));

    }

    @And("seleciona o preco na aba selecione o valor do seguro {string} e clica no botao next")
    public void selecionaOPrecoDaAbaSelecioneOValorDoSeguroEClicaNoBotaoNext(String arg0) {


        // selecionar a opcao de seguro desejada "Select Price Option"
        WebElement gold = driver.findElement((By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span")));
        gold.click();

        //clicando em next
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement botaosendquote = wait1.until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")));
        botaosendquote.click();
    }

    @And("preenche o formulario da aba envia questionario {string} e pressione o botao Send")
    public void preencheOFormularioDaAbaEnviaQuestionarioEPressioneOBotaoSend(String arg0) {

        //preencher com o e-mail
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("mariafarias@gmail.com");

        //preencher com o telefone "Phone"
        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("5511958245612");

        // cadastrar um nome de usuario "Username"
        WebElement nomeusuario = driver.findElement(By.id("username"));
        nomeusuario.sendKeys("mariafarias");

        //cadastrar uma senha "Password"
        WebElement senha = driver.findElement(By.id("password"));
        senha   .sendKeys("QtiBawmW1n");

        // confirmar a senha "Confirm Password"
        WebElement confirmarsenha = driver.findElement(By.id("confirmpassword"));
        confirmarsenha.sendKeys("QtiBawmW1n");

        //preencher com observacoes ou comentarios referente ao seguro "Comments"
        WebElement comentario = driver.findElement(By.id("Comments"));
        comentario.sendKeys("Lorem ipsum mauris justo non quisque sed cursus, turpis id interdum justo tincidunt dictum, mattis potenti sodales eros praesent hac. ");

        //clicar no botÃ£o enviar "Send"
        WebElement enviar = driver.findElement(By.id("sendemail"));
        enviar.click();
    }

    @Then("o sistema deve emitir a mensagem {string} na tela")
    public void oSistemaDeveEmitirAMensagemNaTela(String arg0) {

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement mensagem = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/h2")));
        Assertions.assertEquals("Sending e-mail success!", driver.findElement(By.xpath("/html/body/div[4]/h2")).getText());
        driver.findElement(By.className("confirm")).click();






    }



    @After
    public void exit() {
        driver.quit();

    }
}






