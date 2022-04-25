package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dadospage {

    private WebDriver driver;

    @FindBy(id = "make") WebElement fabricante;

    public Dadospage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);;
    }


    public void escolherFabricante () {

        Select selectFabricante = new Select(fabricante);
        selectFabricante.selectByValue("BMW");

    }
}
