package stepDefinition;


import bsh.util.JConsole;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class jobStepDefinition {

    WebDriver driver;

    @Given("^User on the Welcome page of \"([^\"]*)\"$")
    public void user_on_the_Welcome_page_of(String arg1) throws Throwable {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(arg1);
        driver.manage().window().maximize();

    }

    @When("^User click on sinhala$")
    public void user_click_on_sinhala() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"body-container\"]/div/div[1]/div[3]/div/ul/li[1]/a")).click();
    }

    @Then("^User should navigate to home page successfully with correct sinhala$")
    public void user_should_navigate_to_home_page_successfully_with_correct_sinhala() throws Throwable {

        System.out.println("navigate to Sinhala home page successfully ");
    }

    @When("^User click on tamil$")
    public void user_click_on_tamil() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"body-container\"]/div/div[1]/div[3]/div/ul/li[2]/a")).click();
    }

    @Then("^User should navigate to home page successfully with correct tamil$")
    public void user_should_navigate_to_home_page_successfully_with_correct_tamil() throws Throwable {
        System.out.println("navigate to Tamil home page successfully");
    }

    @When("^User click on english$")
    public void user_click_on_english() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"body-container\"]/div/div[1]/div[3]/div/ul/li[3]/a")).click();
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^User should navigate to home page successfully with correct english$")
    public void user_should_navigate_to_home_page_successfully_with_correct_english() throws Throwable {
        System.out.println("navigate to English home page successfully");
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
