package tests;

import org.junit.jupiter.api.Test;
import pages.WomenPage;

public class VerifyCheckout extends BaseTest{

    @Test
    public void verifyCheckout(){
        WomenPage wp = new WomenPage();
        wp.openWomen();
        wp.chooseSizeM();
        wp.verifyFilterM();
        wp.openViewport();
        wp.addQuantity2ToCart();
        wp.checkProductsCount();
    }
}
