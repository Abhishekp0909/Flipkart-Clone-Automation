package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.List;

public class TC18VerifyBrokenLinks {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyBrokenLinks(){
        Navigation navigation=new Navigation();
        List<WebElement> allLink=navigation.getAllMenuItem();
        Assert.assertFalse(allLink.isEmpty(),"Test Fail:No Links Found On Page");

        boolean brokenFound=false;

        for (WebElement link:allLink){
            String url=link.getAttribute("href");

            if(url==null||url.isEmpty())continue;

            try {
                HttpsURLConnection conn=(HttpsURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int resCode=conn.getResponseCode();

                if(resCode>=400){
                    System.out.println("Broken Link Found: " + url + " | Response Code: " + resCode);
                    brokenFound=true;
                }
            } catch (Exception e){
                System.out.println("Exception for URL: " + url + " | " + e.getMessage());
                brokenFound=true;
            }
        }
        Assert.assertFalse(brokenFound,"Broken Link Found on the page!");
    }
    public void close(){
        BaseClass.closeBrowser();
    }
}
