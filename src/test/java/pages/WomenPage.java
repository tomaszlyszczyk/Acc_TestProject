package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WomenPage extends BaseTest {
    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, 120);
    // CONST
    String TITLE = "Women";
    String WOMEN = "https://autodemo.testoneo.com/en/5-women";
    // locators

    @FindBy(css = "li:nth-child(2) > label > span > input")
    public WebElement sizeM;

    @FindBy(xpath = "//a[@class='quick-view']")
    public WebElement quickView;

    @FindBy(id = "quantity_wanted")
    public WebElement quantity;

    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    public WebElement addToCart;

    @FindBy (css = "p[class='cart-products-count']")
    public WebElement productsCount;


    // actions


    public void checkTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = TITLE;
        assertEquals(expectedTitle, actualTitle);
    }

    public void openWomen() {
        driver.get(WOMEN);
    }
    public void chooseSizeM() {

        sizeM.click();}

    public void verifyFilterM(){

        Assertions.assertTrue(sizeM.isSelected());
        //Assertions.assertTrue(sizeM.getAttribute("checked") != null); //też działa
        }
    public void openViewport() {
        Actions a = new Actions(driver);
        a.moveToElement(quickView).perform();
        wait.until(ExpectedConditions.elementToBeClickable(quickView)).click();
    }
    public void addQuantity2ToCart() {
        quantity.clear();
        quantity.sendKeys("2");
        addToCart.click();
    }
    public void checkProductsCount() throws InterruptedException {
        Thread.sleep(3000); // zamiana na explicit i jakis sensowny warunek
        String quantityInfoText = productsCount.getText();
        System.out.println(quantityInfoText);
        Integer quantityInfoNumber = Integer.parseInt(quantityInfoText.replaceAll("\\D",""));
        Assertions.assertEquals(2, quantityInfoNumber);
        //Assertions.assertEquals(true, (productsCount.getText()).contains("2"));
    }
    }

