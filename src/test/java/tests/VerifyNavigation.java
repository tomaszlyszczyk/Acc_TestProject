package tests;

import components.HeaderComponent;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.ClothesPage;
import pages.WomenPage;

public class VerifyNavigation extends BaseTest {



    @Test
    public void navigateToWomen()  {

        BasePage bp = new BasePage();
        bp.openMain();
        HeaderComponent hc = new HeaderComponent();
        hc.goToClothes();
        ClothesPage cp = new ClothesPage();
        cp.goToWomen();
        WomenPage wp = new WomenPage();
        wp.checkTitle();
    }

}