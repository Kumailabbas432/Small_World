package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    public static void verify_user_logged_in(WebDriver driver) {

        WebElement app_logo = driver.findElement(By.className("app_logo"));
        Assert.assertEquals(true,app_logo.isDisplayed());

        String exp_app_logo_text = "Swag Labs";
        String act_app_logo_text = app_logo.getText();
        Assert.assertEquals(exp_app_logo_text,act_app_logo_text);

    }

    public static void logout_user(WebDriver driver) {

        WebElement hamburger = driver.findElement(By.id("react-burger-menu-btn"));
        hamburger.click();
        Assert.assertEquals(true,hamburger.isDisplayed());

        WebElement logout_sidebar = driver.findElement(By.id("logout_sidebar_link"));
        Assert.assertEquals(true,logout_sidebar.isDisplayed());
        logout_sidebar.click();
    }


}
