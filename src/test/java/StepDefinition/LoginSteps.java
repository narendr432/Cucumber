package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.nio.file.Paths;

public class LoginSteps {

  public WebDriver driver=null;


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", Paths.get("").toAbsolutePath().toString()+"\\Drivers\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.setBinary(Paths.get("").toAbsolutePath().toString()+"/Drivers/chromedriver.exe");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--headless");
        options.setHeadless(true);
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V1/index.php");
        System.out.println("--------------------------");

    }
    @When("user enter the username and password")
    public void user_enter_the_username_and_password() {
        driver.findElement(By.name("uid")).sendKeys("mngr541220");
        driver.findElement(By.name("password")).sendKeys("raduqyp");

    }
    @Then("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.name("btnLogin")).click();
    }
    @Then("user navigate to homepage")
    public void user_navigate_to_homepage() {
        driver.close();

    }



}
