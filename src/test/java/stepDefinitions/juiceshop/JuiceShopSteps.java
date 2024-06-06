package stepDefinitions.juiceshop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.pageObjects.JuiceShopMethods;
import utils.ContextSetup;
import java.time.Duration;


public class JuiceShopSteps {

    public WebDriver driver;
    ContextSetup contextSetup;
    JuiceShopMethods juiceShopMethods;

    String uName = "yeliasahmed89@gmail.com";
    String pwd = "Asdfgh#123";



    public JuiceShopSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.juiceShopMethods = contextSetup.pageObjectManager.getJuiceShopMethods();
        this.driver = juiceShopMethods.driver;
    }


    @Given("owasp home page is displayed")
    public void HomePage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getHomePage()));
        Assert.assertTrue(juiceShopMethods.getHomePage().isDisplayed());
        Assert.assertTrue(juiceShopMethods.getDismiss().isDisplayed());
        juiceShopMethods.getDismiss().click();
    }
    @Then("Check that Account option available")
    public void AccountOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getAccount()));
        Assert.assertTrue(juiceShopMethods.getAccount().isDisplayed());

    }
    @When("Click on the Account option")
    public void Account() {
        juiceShopMethods.getAccount().click();
    }
    @And("Click on the login option")
    public void FirstLoginButton() {
        Assert.assertTrue(juiceShopMethods.getFirstLoginButton().isDisplayed());
        juiceShopMethods.getFirstLoginButton().click();
        Assert.assertTrue(juiceShopMethods.getLoginForm().isDisplayed());
    }
    @And("enter username and password")
    public void UsernamePassword() {
        Assert.assertTrue(juiceShopMethods.getUsername().isDisplayed());
        juiceShopMethods.getUsername().sendKeys(uName);

        Assert.assertTrue(juiceShopMethods.getPassword().isDisplayed());
        juiceShopMethods.getPassword().sendKeys(pwd);

    }

    @And("Click on the Log in button")
    public void LoginButton() throws InterruptedException {
        Assert.assertTrue(juiceShopMethods.getLoginButton().isDisplayed());
        juiceShopMethods.getLoginButton().click();
        Thread.sleep(1000);

    }

    @And("Add to basket for 1 item")
    public void AddToBasket() throws InterruptedException {
        Assert.assertTrue(juiceShopMethods.getAddToBasket().isDisplayed());
        juiceShopMethods.getAddToBasket().click();
        Thread.sleep(3000);

    }

    @Then("Check that the 1 item is added notification is displayed")
    public void Notification() throws InterruptedException {
        Assert.assertTrue(juiceShopMethods.getNotification().isDisplayed());
        Assert.assertEquals(juiceShopMethods.getNotification().getText(), juiceShopMethods.getText);
        System.out.println(juiceShopMethods.getText);


    }

    @When("Click on your basket")
    public void YourBasket() throws InterruptedException {
        Assert.assertTrue(juiceShopMethods.getYourBasket().isDisplayed());
        juiceShopMethods.getYourBasket().click();
        Thread.sleep(2000);

    }

    @Then("check that 1 item is added")
    public void AddedOneItemDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getAddedOneItemDisplayed()));
        Assert.assertTrue(juiceShopMethods.getAddedOneItemDisplayed().isDisplayed());
        Assert.assertEquals(juiceShopMethods.getAddedOneItemDisplayed().getText(), juiceShopMethods.getText);
    }

    @When("Click on the Checkout button")
    public void CheckoutButton() {
        Assert.assertTrue(juiceShopMethods.getCheckout().isDisplayed());
        juiceShopMethods.getCheckout().click();
    }

    @Then("Check that add new address is displayed")
    public void NewAddress() {

        Assert.assertTrue(juiceShopMethods.getAddNewAddress().isDisplayed());
        Assert.assertEquals(juiceShopMethods.getAddNewAddress().getText(), juiceShopMethods.getText);
    }

    @When("Click on the Add new address")
    public void NewAddressButton() {
        juiceShopMethods.getAddNewAddress().click();
    }

    @Then("Check that the add new address form is displayed")
    public void NewAddressForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getAddNewAddressForm()));
        Assert.assertTrue(juiceShopMethods.getAddNewAddressForm().isDisplayed());
        Assert.assertEquals(juiceShopMethods.getAddNewAddressForm().getText(), juiceShopMethods.getText);
        System.out.println(juiceShopMethods.getText);


    }

    @When("Fill the address form")
    public void FillUpAddressForm() {

        Assert.assertTrue(juiceShopMethods.getCountry().isDisplayed());
        juiceShopMethods.getCountry().sendKeys("Bangladesh");

        Assert.assertTrue(juiceShopMethods.getName().isDisplayed());
        juiceShopMethods.getName().sendKeys("Yelias Ahmed");

        Assert.assertTrue(juiceShopMethods.getMobileNo().isDisplayed());
        juiceShopMethods.getMobileNo().sendKeys("01236958466");

        Assert.assertTrue(juiceShopMethods.getZipCode().isDisplayed());
        juiceShopMethods.getZipCode().sendKeys("1207");

        Assert.assertTrue(juiceShopMethods.getAddress().isDisplayed());
        juiceShopMethods.getAddress().sendKeys("Golden street");

        Assert.assertTrue(juiceShopMethods.getCity().isDisplayed());
        juiceShopMethods.getCity().sendKeys("Shyamoli");

        Assert.assertTrue(juiceShopMethods.getState().isDisplayed());
        juiceShopMethods.getState().sendKeys("Dhaka");

    }

    @And("Click on the submit button")
    public void SubmitButton() {
        Assert.assertTrue(juiceShopMethods.getSubmitButton().isDisplayed());
        juiceShopMethods.getSubmitButton().click();
    }
    @Then("Check that search button is displayed")
    public void SearchButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getSearchButton()));
        Assert.assertTrue(juiceShopMethods.getSearchButton().isDisplayed());
    }
    @When("Click on the Search Button")
    public void SearchButtonClick() {
        juiceShopMethods.getSearchButton().click();
    }
    @And("search for apple")
    public void SearchItem() {
        juiceShopMethods.getSearchInput().sendKeys("apple");
    }
    @Then("Check that 2 apple product is displayed and banana isn't displayed")
    public void SearchingItemDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(juiceShopMethods.getSearchingItemDisplayed()));
        Assert.assertTrue(juiceShopMethods.getSearchingItemDisplayed().isDisplayed());
        Assert.assertEquals(juiceShopMethods.getSearchingItemDisplayed().getText(), juiceShopMethods.getText);
    }
}
