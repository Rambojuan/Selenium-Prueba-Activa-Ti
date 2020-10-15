package stepdefinition;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.channel.ChannelOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SignUpPageObject;

public class SignUpStepDef {
    @Given("Activa Ti Login")
    public void loginAccount() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/windows/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);
        signUpPageObject.go("https://preprod.activa-it.net/Login.aspx");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        signUpPageObject.writeFirstName("Tester_IT");
        signUpPageObject.writePass("Temporal01");
        driver.findElement(By.id("btnLogin")).click();

    }

    @When("Cuando logea debe llenar el formulario de ingreso de facturas")
    public void he_send_required_information_to_get_the_account() {
    }

    @Then("Factura exitosa")
    public void he_should_be_told_that_the_account_was_created() {
    }
}
