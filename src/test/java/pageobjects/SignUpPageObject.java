package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageObject {

    private WebDriver driver;

    public SignUpPageObject(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameTextbox = By.xpath("//input[@name='user']");
    private By pass = By.xpath("//input[@name='pass']");
    private By confAvanzada = By.id("details-button");
    private By linkAdv = By.id("proceed-link");
    private By login = By.id("btnLogin");


    public void go(String url) {this.driver.get(url);}

    public void writeFirstName(String firstname){
        this.driver.findElement(this.firstNameTextbox).sendKeys(firstname);
    }
    public void writePass(String pass){
        this.driver.findElement(this.pass).sendKeys(pass);
    }
    public void clickConfAvanzada(){ this.driver.findElement(this.pass).click(); }
    public void clickLinkAdv(){ this.driver.findElement(this.pass).click(); }
    public void login(){ this.driver.findElement(this.pass).click(); }

}
