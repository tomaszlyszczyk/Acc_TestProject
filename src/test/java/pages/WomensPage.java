package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WomensPage extends BaseTest {
    public WomensPage() {
        PageFactory.initElements(driver, this);
    }

    // CONST
    String TITLE = "Women";
    // locators


    // actions


    public void checkTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = TITLE;
        assertEquals(expectedTitle,actualTitle);


    }



    }

