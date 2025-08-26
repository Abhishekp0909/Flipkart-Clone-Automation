package MainPage;

import Base.BaseClass;
import org.openqa.selenium.By;

public class HomePageMenu {
    private final By homePage=By.xpath("//a[text()=' Home']");
    private final By productPage=By.xpath("//a[text()=' Products']");
    private final By cartPage=By.xpath("//a[text()=' Cart']");
    private final By loginPage=By.xpath("//a[text()=' Signup / Login']");
    private final By contactUsPage=By.xpath("//a[text()=' Contact us']");

    public void getHomePage(){
        BaseClass.getDriver().findElement(homePage).click();
    }
    public void getProductPage(){
        BaseClass.getDriver().findElement(productPage).click();
    }
    public void getCartPage(){
        BaseClass.getDriver().findElement(cartPage).click();
    }
    public void getLoginPage(){
        BaseClass.getDriver().findElement(loginPage).click();
    }
    public void getContactUsPage(){
        BaseClass.getDriver().findElement(contactUsPage).click();
    }
}
