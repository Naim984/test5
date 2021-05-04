package stepDefinations;

import cucumber.annotation.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import objectReposity.HomepageReposityRia;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


@RunWith(Cucumber.class)
public class HomeRia extends Base {
    WebDriver driver;
    HomepageReposityRia homepageria;



    @Given("^the user enter text$")
    public void the_user_enter_text() throws Throwable {
        driver = initializeDriver();
        homepageria = new HomepageReposityRia(driver);
        homepageria.waitpage();
        homepageria.pageria();
        homepageria.textcenter().click();
        homepageria.textcenter().clear();
        homepageria.buttonpublish().click();
        String resulttext = homepageria.textresult().getText();
        System.out.println(resulttext);
         if (resulttext.equals("There was nothing to post. Go back!")) {
            System.out.println("\n" +
                    "correct select ");
        } else {
            System.out.println("\n" +
                    "select show Missing");

        }
    }

    @Given("^the user enter text valid$")
    public void the_user_enter_text_valid() throws Throwable {
        driver = initializeDriver();
        homepageria = new HomepageReposityRia(driver);
        homepageria.pageria();
        homepageria.textcenter().sendKeys("test");
        homepageria.buttonpublish().click();
        String resulttext2 = homepageria.textresult2().getText();
        System.out.println(resulttext2);
        if (resulttext2.equals("test")) {
            System.out.println("\n" +
                    "correc select");
        } else {
            System.out.println("\n" +
                    "select show Missing");

        }
    }

    @Given("^user enters text and makes it bold$")
    public void user_enters_text_and_makes_it_bold() throws Throwable {
        driver = initializeDriver();
        homepageria = new HomepageReposityRia(driver);
        homepageria.pageria();
        homepageria.textcenter().sendKeys("test");
        homepageria.buttonpublish().click();
        String resulttext3 = homepageria.textresult2().getText();
        System.out.print("\u001B[30m"+ resulttext3);

    }
    }




