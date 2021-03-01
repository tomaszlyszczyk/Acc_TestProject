package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class HeaderComponent extends BaseTest {
    public HeaderComponent() {
        PageFactory.initElements(driver, this);
    }
        // CONST

        // locators
        @FindBy(xpath = "//a[@href='https://autodemo.testoneo.com/en/3-clothes']" )
        public WebElement clothesButton;



        // actions
        public void goToClothes(){
            clothesButton.click();
        }

}
