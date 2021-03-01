package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;


public class ClothesPage extends BaseTest {

    public ClothesPage() {
        PageFactory.initElements(driver, this);

    }


    // locators
    @FindBy(xpath = "//a[@href='https://autodemo.testoneo.com/en/5-women']")
    public WebElement womenPage;

     //actions

    public void goToWomen() { womenPage.click(); }

    }

