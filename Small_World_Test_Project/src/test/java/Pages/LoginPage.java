package Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {

    public static void user_lands_sauce_demo_page(WebDriver driver) {

        driver.get("https://www.saucedemo.com/");

    }

    public static void verify_page(WebDriver driver) {

        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public static void verify_user_should_not_logged_in(WebDriver driver) {

        WebElement login_error = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]"));
        Assert.assertEquals(true,login_error.isDisplayed());

        String exp_error_text = "Epic sadface: Username and password do not match any user in this service";
        String act_error_text = login_error.getText();
        Assert.assertEquals(exp_error_text,act_error_text);

    }

    public static void verify_user_logged_out(WebDriver driver) {

        WebElement login_logo = driver.findElement(By.className("login_logo"));
        Assert.assertEquals(true,login_logo.isDisplayed());

        String exp_login_logo_text = "Swag Labs";
        String act_login_logo_text = login_logo.getText();
        Assert.assertEquals(exp_login_logo_text,act_login_logo_text);

    }


    public static void loginWithAnd(String username, String pwd, WebDriver driver) {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login-button")).click();

    }


    public static void try_login_with_invalid_credentialAnd(String username, String pwd, WebDriver driver) {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login-button")).click();

    }




}