package FooterLink;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001VerifyFooterSection {
    @Test
    public void VerifyFooterSection(){
        FooterLink footer=new FooterLink();
        footer.launchBrowser();
        WebElement fotOption=footer.findFooter();
        Assert.assertTrue(fotOption.isDisplayed(),"Test Failed:Footer Option Is Not Available");
    }
}
