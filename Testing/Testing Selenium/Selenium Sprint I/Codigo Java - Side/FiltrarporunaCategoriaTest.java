// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FiltrarporunaCategoriaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void filtrarporunaCategoria() {
    driver.get("http://localhost:3000/home");
    driver.manage().window().setSize(new Dimension(1552, 832));
    {
      WebElement element = driver.findElement(By.linkText("A vehicle to your destiny"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    assertThat(driver.findElement(By.cssSelector(".category:nth-child(1) > h2")).getText(), is("Coupe"));
    driver.findElement(By.cssSelector(".card:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".card:nth-child(2) > .card-img")).click();
    driver.findElement(By.cssSelector(".card:nth-child(2) > .card-img")).click();
    driver.findElement(By.cssSelector(".card:nth-child(3) > .card-information")).click();
    driver.findElement(By.cssSelector(".card:nth-child(4) > .card-img")).click();
    driver.findElement(By.cssSelector(".header__left img")).click();
  }
}
