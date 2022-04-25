package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {


    @FindBy(id = "nav_automobile") WebElement automovel;



    private WebDriver driver;


     public MenuPage (WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);;

     }

public void AutomobileMenu  () {
       automovel.click();


}
}


