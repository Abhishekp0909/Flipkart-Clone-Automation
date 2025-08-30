package NavigationMenu;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class Navigation {
    private final By homePageNavigationMenu=By.xpath("//div[@class='shop-menu pull-right']");

    public WebElement getHomePageNavigationMenu(){
        return BaseClass.getDriver().findElement(homePageNavigationMenu);
    }
}
