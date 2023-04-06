import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data{

    private By btnLogin = By.xpath("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']");
    private By btnJoin = By.xpath("//div[@class='login__alt-cta text-center']//a[@href='/join']");
    private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputUserName = By.xpath("//div[@class='form-group']//input[@id='user_username']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btnRegistration = By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");

    @Test
    public void registration () {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(btnJoin).click();
        driver.findElement(inputFirstName).sendKeys(getDate.firstName);
        driver.findElement(inputLastName).sendKeys(getDate.lastName);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputUserName).sendKeys(getDate.userName);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btnRegistration ).click();
        sleep(3000);
        driver.quit();
    }

    private void sleep(int i) {
    }
}
