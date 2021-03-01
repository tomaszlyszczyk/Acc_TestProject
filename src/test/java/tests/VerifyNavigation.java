package tests;

import components.HeaderComponent;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.ClothesPage;

public class VerifyNavigation extends BaseTest {

    String TITLE = "Women";

    @Test
    public void navigateToWomen()  {

        BasePage bp = new BasePage();
        bp.goTo();
        HeaderComponent hc = new HeaderComponent();
        hc.goToClothes();
        ClothesPage cp = new ClothesPage();
        cp.goToWomen();
        //WomensPage wp = new WomensPage();
        //wp.checkTitle();
    }

}