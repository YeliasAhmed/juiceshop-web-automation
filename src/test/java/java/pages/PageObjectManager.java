package java.pages;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.JuiceShopMethods;

public class PageObjectManager {
    public static WebDriver driver;
    public JuiceShopMethods juiceShopMethods;


    public PageObjectManager(WebDriver driver){

        this.driver = driver;
    }
    public JuiceShopMethods getJuiceShopMethods(){
        juiceShopMethods = new JuiceShopMethods(driver);
        return juiceShopMethods;
    }
}
