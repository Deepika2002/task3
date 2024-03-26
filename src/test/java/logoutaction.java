import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutaction implements Runnable{
	private WebDriver driver;

    public logoutaction(WebDriver driver) {
        this.driver = driver;
    }

    public void run() {
    	WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        logoutButton.click();
    }
}
