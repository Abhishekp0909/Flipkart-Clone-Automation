package NavigationMenu;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class Navigation {
    private final By homePageNavigationMenu=By.xpath("//div[@class='shop-menu pull-right']");
    private final By HomeOption=By.xpath("//a[normalize-space(text())='Home']");
    private final By productMenu=By.xpath("//a[normalize-space(text())='Products']");
    private final By cartMenu=By.xpath("//a[normalize-space(text())='Cart']");
    private final By signUpOrLogin=By.xpath("//a[normalize-space(text())='Signup / Login']");
    private final By testCaseMenu=By.xpath("//a[normalize-space(text())='Test Cases']");
    private final By apiTestMenu=By.xpath("//a[normalize-space(text())='API Testing']");
    private final By videoTutMenu=By.xpath("//a[normalize-space(text())='Video Tutorials']");
    private final By contactUsMenu=By.xpath("//a[normalize-space(text())='Contact us']");

    public WebElement getHomePageNavigationMenu(){
        return BaseClass.getDriver().findElement(homePageNavigationMenu);
    }

    public WebElement Home(){
        return BaseClass.getDriver().findElement(HomeOption);
    }

    public WebElement product(){
        return BaseClass.getDriver().findElement(productMenu);
    }
    public WebElement cart(){
        return  BaseClass.getDriver().findElement(cartMenu);
    }
    public WebElement signUpOrLogIn(){
        return BaseClass.getDriver().findElement(signUpOrLogin);
    }
    public WebElement testCase(){
        return BaseClass.getDriver().findElement(testCaseMenu);
    }
    public WebElement apiTesting(){
        return BaseClass.getDriver().findElement(apiTestMenu);
    }
    public WebElement videoTutorial(){
        return BaseClass.getDriver().findElement(videoTutMenu);
    }
    public WebElement contactUs(){
        return  BaseClass.getDriver().findElement(contactUsMenu);
    }

}
