package Login;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final By loginOption=By.xpath("//a[text()=' Signup / Login']");
    private final By nameTextField=By.name("email");
    private final By passTextField=By.name("password");
    private final By submitButton=By.xpath("//button[@type='submit']");
    private final By loginError=By.xpath("//p[text()='Your email or password is incorrect!']");
    private final By logOut=By.xpath("//a[text()=' Logout']");

    public void getLoginPage(){
        BaseClass.getDriver().findElement(loginOption).click();
    }
    public void getNameTextField(String email){
        BaseClass.getDriver().findElement(nameTextField).sendKeys(email);
    }
    public void getPassTextField(String pass){
        BaseClass.getDriver().findElement(passTextField).sendKeys(pass);
    }
    public void getSubmitButton(){
        BaseClass.getDriver().findElement(submitButton).click();
    }
    public boolean getErrorMsg(){
      return BaseClass.getDriver().findElement(loginError).isDisplayed();
    }
    public boolean getLogOutOption(){
     return BaseClass.getDriver().findElement(logOut).isDisplayed();
    }
    public void clickLogout(){
        BaseClass.getDriver().findElement(logOut).click();
    }
    public boolean nameField(){
        return BaseClass.getDriver().findElement(nameTextField).isDisplayed();
    }
    public boolean loggedInPage(){
        WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
        return BaseClass.getDriver().findElement(loginOption).isDisplayed();
    }

}
