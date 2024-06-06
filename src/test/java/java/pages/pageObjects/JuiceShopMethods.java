package java.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JuiceShopMethods {

    public WebDriver driver;

    public String getText;

    //        By account = By.xpath("//button[@id='navbarAccount']");
    By homePage = By.xpath("//button[@aria-label='Back to homepage']");
    By loginForm = By.xpath("//mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6']");
    By dismiss = By.xpath("//button[@aria-label='Close Welcome Banner']");
    By account = By.id("navbarAccount");
    By firstLoginButton = By.id("navbarLoginButton");
    By email = By.id("email");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@id='loginButton']");
    By addToBasket = By.xpath("(//span[contains(text(),'Add to Basket')])[1]");
    By addedNotification = By.className("mat-simple-snack-bar-content");
    By yourBasket = By.xpath("//span[normalize-space()='Your Basket']");
    By addedItemDislayed = By.xpath("(//app-purchase-basket)[1]");
    By checkOut = By.xpath("//span[normalize-space()='Checkout']");
    By addNewAddress = By.xpath("//span[normalize-space()='Add New Address']");
    By addNewAddressForm = By.xpath("//mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6']");
    By country = By.xpath("//input[@id='mat-input-1']");
    By name = By.xpath("//input[@id='mat-input-2']");
    By mobileNo = By.xpath("//input[@id='mat-input-3']");
    By zipCode = By.xpath("//input[@id='mat-input-4']");
    By address = By.xpath("//textarea[@id='address']");
    By city = By.xpath("//input[@id='mat-input-6']");
    By state = By.xpath("//input[@id='mat-input-7']");
    By submitButton = By.xpath("//button[@id='submitButton']");

    By searchButton = By.xpath("//mat-icon[normalize-space()='search']");
    By searchInput = By.xpath("//input[@id='mat-input-0']");
    By searchItems = By.xpath("//mat-grid-list[@class='mat-grid-list']");
    public JuiceShopMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomePage(){
        return driver.findElement(homePage);
    }
    public WebElement getDismiss(){
        return driver.findElement(dismiss);
    }
    public WebElement getAccount(){
        return driver.findElement(account);
    }
    public WebElement getFirstLoginButton(){
        return driver.findElement(firstLoginButton);
    }
    public WebElement getLoginForm(){
        return driver.findElement(loginForm);
    }
    public WebElement getUsername(){
        return driver.findElement(email);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }
    public WebElement getAddToBasket(){

        return driver.findElement(addToBasket);
    }
    public WebElement getNotification(){
        getText = driver.findElement(addedNotification).getText();
        return driver.findElement(addedNotification);
    }

    public WebElement getYourBasket(){
        return driver.findElement(yourBasket);
    }
    public WebElement getAddedOneItemDisplayed(){

        getText = driver.findElement(addedItemDislayed).getText();
        return driver.findElement(addedItemDislayed);
    }
    public WebElement getCheckout(){
        return driver.findElement(checkOut);
    }
    public WebElement getAddNewAddress(){
        getText = driver.findElement(addNewAddress).getText();
        return driver.findElement(addNewAddress);
    }
    public WebElement getAddNewAddressForm(){
        getText = driver.findElement(addNewAddressForm).getText();
        return driver.findElement(addNewAddressForm);
    }
    public WebElement getCountry(){
        return driver.findElement(country);
    }
    public WebElement getName(){
        return driver.findElement(name);
    }
    public WebElement getMobileNo(){
        return driver.findElement(mobileNo);
    }
    public WebElement getZipCode(){
        return driver.findElement(zipCode);
    }
    public WebElement getAddress(){
        return driver.findElement(address);
    }
    public WebElement getCity(){
        return driver.findElement(city);
    }
    public WebElement getState(){
        return driver.findElement(state);
    }
    public WebElement getSubmitButton(){
        return driver.findElement(submitButton);
    }
    public WebElement getSearchButton(){
        return driver.findElement(searchButton);
    }
    public WebElement getSearchInput(){
        return driver.findElement(searchInput);
    }
    public WebElement getSearchingItemDisplayed(){
        getText = driver.findElement(searchItems).getText();
        return driver.findElement(searchItems);
    }

}
