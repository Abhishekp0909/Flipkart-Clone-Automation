package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC19VerifyNavigationMenuDropdownMenus {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyNavigationMenuDropdownMenus(){
        Navigation navigation=new Navigation();
        List<WebElement> dropdown=navigation.getAllDropDown();
        Assert.assertTrue(dropdown.isEmpty(),"Unexpected dropdowns found in navigation Menu ");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
