import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdadeTest {
    @Test
    public void testIdadeDezesseteAnos() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/src/idade.php");
        driver.findElement(By.name("idade")).sendKeys("17");
        driver.findElement(By.id("btn-votar")).click();
        
        String resultado = driver.findElement(By.id("mensagem")).getText();
        assertEquals("Não pode votar", resultado);
        driver.quit();
    }
}
