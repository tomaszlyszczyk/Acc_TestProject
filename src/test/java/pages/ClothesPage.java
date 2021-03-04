package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;


public class ClothesPage extends BaseTest {

    public ClothesPage() {
        PageFactory.initElements(driver, this);

    }
     //CONST

    String TITLE = "Clothes";
    String CLOTHES = "https://autodemo.testoneo.com/en/3-clothes";

    // locators
    @FindBy(xpath = "//ul[@class='category-sub-menu']/li[2]/a")
    public WebElement womenPage;

     //actions

    public void goToWomen() {

        womenPage.click(); }

    public void openClothes() {
        driver.get(CLOTHES);
    }
}



