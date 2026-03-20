import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperaturaTest {
    @Test
    public void testTemperaturaFria() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/src/temperatura.php");
        driver.findElement(By.name("temp")).sendKeys("10");
        driver.findElement(By.id("btn-classificar")).click();
        
        String classificacao = driver.findElement(By.id("label-temp")).getText();
        assertEquals("temperatura fria", classificacao);
        driver.quit();
    }
}
