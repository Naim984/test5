package objectReposity;


import com.sun.deploy.cache.Cache;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomepageReposityRia {
    WebDriver driver;
    private Process WebUtil;

    public HomepageReposityRia(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
        String test1;
    }


    @FindBy(xpath = ("/html[1]/body[1]/center[1]"))
    WebElement textresult;

    @FindBy(xpath = ("//body/article/p[1]"))
    WebElement textresult2;


    @FindBy(xpath = ("//body/form[1]/input[1]"))
    WebElement buttonpublish;

    @FindBy(xpath = ("//body/form[1]/textarea[1]"))
    WebElement textcenter;




    public void pageria() throws InterruptedException {
        driver.get("https://txt.fyi/");
        Thread.sleep(10000);
        // Switching to Alert
      //  driver.manage().deleteAllCookies();
       // Thread.sleep(5000);

    }

    public void window_maximize() {
        driver.manage().window().maximize();
    }

    public WebElement textcenter() {

        return textcenter;
    }


    public WebElement buttonpublish() {

        return buttonpublish;
    }

    public WebElement textresult() {

        return textresult;
    }
    public WebElement textresult2() {

        return textresult2;
    }

    public void waitpage() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void captureScreenShot(WebDriver driver) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Cache.copyFile(src, new File("src/test/resources/Capture/screenshot1.png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
