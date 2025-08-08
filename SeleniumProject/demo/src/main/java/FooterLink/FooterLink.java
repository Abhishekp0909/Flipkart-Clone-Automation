package FooterLink;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FooterLink {
    private final By footerOption= By.className("row");
        public void launchBrowser(){
        BaseClass base = new BaseClass();
        base.launchBrowser();
    }
        public WebElement findFooter(){
          return   BaseClass.getDriver().findElement(footerOption);
        }

}
