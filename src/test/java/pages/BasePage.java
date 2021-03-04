package pages;

import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class BasePage extends BaseTest {
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    // CONST
    String MAIN = "https://autodemo.testoneo.com/en/";


    // locators

    // actions

    public void openMain() {
        driver.get(MAIN);
    }
}

