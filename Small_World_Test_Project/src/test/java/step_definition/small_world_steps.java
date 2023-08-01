package step_definition;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.HomePage;

public class small_world_steps {

    WebDriver driver;
    @Given("launch_chrome")
    public void launch_chrome() {

        ////Set directory of the chrome driver
    System.setProperty("webdriver.chrome.driver","D://Coding-git//Small_World_Test//chromedriver-win64//chromedriver.exe");
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = new ChromeDriver();

    }
    @When("user_lands_sauce_demo_page")
    public void user_lands_sauce_demo_page() {
        LoginPage.user_lands_sauce_demo_page(driver);
       
    }
    @Then("verify_page")
    public void verify_page() {

        LoginPage.verify_page(driver);

    }

    @Then("verify_user_logged_in")
    public void verify_user_logged_in() {
    HomePage.verify_user_logged_in(driver);
    }

    @And("close_browser")
    public void close_browser() {
        driver.close();

    }

    @Then("verify_user_should_not_logged_in")
    public void verify_user_should_not_logged_in() {

        LoginPage.verify_user_should_not_logged_in(driver);

    }

    @And("logout_user")
    public void logout_user() {
    HomePage.logout_user(driver);
    }

    @Then("verify_user_logged_out")
    public void verify_user_logged_out() {

        LoginPage.verify_user_logged_out(driver);

    }

    @And("login with {string} and {string}")
    public void loginWithAnd(String username, String pwd) {

        LoginPage.loginWithAnd(username,pwd,driver);

    }

    @And("try_login_with_invalid_credential {string} and {string}")
    public void try_login_with_invalid_credentialAnd(String username, String pwd) {

        LoginPage.try_login_with_invalid_credentialAnd(username,pwd,driver);

    }
}
